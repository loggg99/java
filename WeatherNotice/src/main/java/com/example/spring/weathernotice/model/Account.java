package com.example.spring.weathernotice.model;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@Builder
@ToString
public class Account {
    private String userid;
    private String password;
    private String username;
}
