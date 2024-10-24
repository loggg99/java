package com.example.tobi.redis.dto;

import com.example.tobi.redis.model.Member;
import lombok.Getter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

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