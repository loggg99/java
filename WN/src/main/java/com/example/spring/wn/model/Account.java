package com.example.spring.wn.model;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@Builder
@ToString
public class Account {
    private String userid;  // 여기에서 'userId'로 정의되어 있음
    private String password;
    private String username;



}
