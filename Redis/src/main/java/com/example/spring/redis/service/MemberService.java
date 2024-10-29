package com.example.spring.redis.service;

import com.example.spring.redis.model.Member;
import lombok.RequiredArgsConstructor;
//import org.springframework.data.redis.core.RedisTemplate;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
@RequiredArgsConstructor
public class MemberService {

//    private final RedisTemplate<String, Object> redisTemplate;
    private final PasswordEncoder passwordEncoder;

    private static final String MEMBER_KEY_PREFIX = "member:";

    public void signUp(Member member) {
        // 비밀번호 암호화
        member = Member.builder()
                .userId(member.getUserId())
                .password(passwordEncoder.encode(member.getPassword()))
                .userName(member.getUserName())
                .build();

        // 회원 정보를 Redis에 저장
        String key = MEMBER_KEY_PREFIX + member.getUserId();
//        redisTemplate.opsForValue().set(key, member, 1, TimeUnit.HOURS);
    }
}