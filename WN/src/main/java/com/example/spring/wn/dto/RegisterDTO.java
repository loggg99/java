package com.example.spring.wn.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class RegisterDTO {
    private String userid;
    private String password;
    private String username;

    public RegisterDTO(String userid, String password, String username) {
        this.userid = userid;
        this.password = password;
        this.username = username;

    }

}
