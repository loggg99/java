package com.example.tobi.springsecuritytasha.config.jwt;

import ch.qos.logback.core.util.Duration;
import com.example.tobi.springsecuritytasha.model.Member;
import io.jsonwebtoken.JwtBuilder;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Date;

@Slf4j
@Service
@RequiredArgsConstructor
public class TokenProvider {

    private final JwtProperties jwtProperties;

    public String generateToken(Member member, Duration expiredAt) {

    }

    private String makeToken(Member member, Date expire) {


    }
}
