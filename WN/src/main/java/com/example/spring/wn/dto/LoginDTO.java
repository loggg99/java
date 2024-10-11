package com.example.spring.wn.dto;

import com.example.spring.wn.model.Account;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class LoginDTO {
    private String userId;
    private String password;

    public Account toAccount() {
        return Account.builder()
                .userid(userId)
                .password(password)
                .build();
    }


}
