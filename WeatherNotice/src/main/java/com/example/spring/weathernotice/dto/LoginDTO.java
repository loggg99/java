package com.example.spring.weathernotice.dto;

import com.example.spring.weathernotice.model.Account;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class LoginDTO {
    private String userid;
    private String password;

    public Account toAccount() {
        return Account.builder()
                .userid(userid)
                .password(password)
                .build();
    }


}
