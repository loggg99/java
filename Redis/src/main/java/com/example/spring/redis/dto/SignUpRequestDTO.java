package com.example.spring.redis.dto;

import com.example.spring.redis.model.Member;
import lombok.Getter;

@Getter
public class SignUpRequestDTO {
    private String userId;
    private String password;
    private String userName;

    public Member toMember() {
        return Member.builder()
                .userId(userId)
                .password(password)  // 암호화하지 않은 비밀번호를 그대로 전달
                .userName(userName)
                .build();
    }
}
