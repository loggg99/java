package com.example.spring.weathernotice.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class RegisterDTO {
    private String user_id;
    private String password;
    private String user_name;

    public RegisterDTO(String user_id, String password, String user_name) {
        this.user_id = user_id;
        this.password = password;
        this.user_name = user_name;

    }

}
