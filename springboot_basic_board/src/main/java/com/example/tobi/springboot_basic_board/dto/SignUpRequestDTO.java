package com.example.tobi.springboot_basic_board.dto;


import com.example.tobi.springboot_basic_board.model.Member;
import lombok.Getter;

@Getter
public class SignUpRequestDTO {
    private String userId;
    private String password;
    private String userName;

    public Member toMember() {
        return Member.builder()
                .userid(userId)
                .password(password)
                .Name(userName)
                .build();
    }
}