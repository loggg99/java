package com.example.spring.weathernotice.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class RegisterDTO {
    private String userId;
    private String password;
    private String userName;

    public RegisterDTO(String userId, String password, String userName) {
        this.userId = userId;
        this.password = password;
        this.userName = userName;

    }

}
