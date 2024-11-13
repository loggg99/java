package com.example.tobi.springsecuritytasha.config.jwt;

import com.example.tobi.springsecuritytasha.enums.Role;
import com.example.tobi.springsecuritytasha.model.Member;
import io.jsonwebtoken.*;
import io.jsonwebtoken.security.Keys;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Service;

import javax.crypto.SecretKey;
import java.time.Duration;
import java.util.Base64;
import java.util.Collections;
import java.util.Date;
import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class TokenProvider {

    private final JwtProperties jwtProperties;

    public String generateToken(Member member, Duration expiredAt) {
        Date now = new Date();
        return makeToken(
                member,
                new Date(now.getTime() + expiredAt.toMillis())
        );
    }

    private String makeToken(Member member, Date expire) {

        Date now = new Date();

        return Jwts.builder()
                .setHeaderParam(Header.TYPE, Header.JWT_TYPE)
                .setIssuer(jwtProperties.getIssuer())
                .setIssuedAt(now)
                .setExpiration(expire)
                .setSubject(member.getUserId())
                .claim("id", member.getId())
                .claim("role", member.getRole())
                .claim("userName", member.getUserName())
                .signWith(getSecretKey(), SignatureAlgorithm.HS512)
                .compact();

    }

    public int validateToken(String token) {
        try {
            Jwts.parserBuilder()
                    .setSigningKey(getSecretKey())
                    .build()
                    .parseClaimsJws(token)
                    .getBody();
            log.info("token validated");
            return 1;
        } catch (ExpiredJwtException e) {
            log.info("token is expired");
            return 2;
        } catch (Exception e) {
            log.info("token is invalid");
            return 3;
        }

    }

    public Member getTokenDetails(String token) {
        Claims claims = getClaims(token);
        return Member.builder()
                .id(claims.get("id", Long.class))
                .userId(claims.getSubject())
                .userName(claims.get("userName", String.class))
                .role(Role.valueOf(claims.get("role", String.class)))
                .build();

    }

    public Authentication getAuthentication(String token) {
        Claims claims = getClaims(token);

        List<SimpleGrantedAuthority> authorities = Collections.singletonList(
                new SimpleGrantedAuthority(String.valueOf(claims.get("role")))
        );

        User user = new User(claims.getSubject(), "", authorities);

        return new UsernamePasswordAuthenticationToken(user, token, authorities);


    }

    private Claims getClaims(String token) {
        return Jwts.parserBuilder()
                .setSigningKey(getSecretKey())
                .build()
                .parseClaimsJws(token)
                .getBody();
    }



    private SecretKey getSecretKey() {
        byte[] keyBytes = Base64.getDecoder().decode(jwtProperties.getSecretKey());
        return Keys.hmacShaKeyFor(keyBytes);

    }


}
