package com.example.tobi.springsecuritytasha.dto;

import com.example.tobi.springsecuritytasha.model.Member;
import lombok.Getter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Getter
public class SignUpRequestDTO {
    private String userId;
    private String password;
    private String userName;

    public Member toMember(BCryptPasswordEncoder bCryptPasswordEncoder) {
        return Member.builder()
                .userId(userId)
                .password(bCryptPasswordEncoder.encode(password))
                .userName(userName)
                .build();
    }
}
