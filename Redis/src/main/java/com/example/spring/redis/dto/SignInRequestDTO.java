package com.example.spring.redis.dto;

import com.example.spring.redis.model.Member;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class SignInRequestDTO {
    private String userId;
    private String password;

    public Member toMember() {
        return Member.builder()
                .userId(userId)
                .password(password)
                .build();
    }
}
