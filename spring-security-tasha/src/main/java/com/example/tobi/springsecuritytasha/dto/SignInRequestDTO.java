package com.example.tobi.springsecuritytasha.dto;

import com.example.tobi.springsecuritytasha.model.Member;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class SignInRequestDTO {
    private String userId;
    private String password;


}
