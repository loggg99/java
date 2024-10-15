package com.example.spring.weathernotice.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class RegisterDTO {
<<<<<<< HEAD
    private String userid;
    private String password;
    private String username;

    public RegisterDTO(String userid, String password, String username) {
        this.userid = userid;
        this.password = password;
        this.username = username;
=======
    private String user_id;
    private String password;
    private String user_name;

    public RegisterDTO(String user_id, String password, String user_name) {
        this.user_id = user_id;
        this.password = password;
        this.user_name = user_name;
>>>>>>> 2ab4e023df6867cd976f8545a4bb64c0cb52043d

    }

}
