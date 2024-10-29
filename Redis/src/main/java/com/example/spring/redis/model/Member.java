package com.example.spring.redis.model;


import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Builder
@ToString
public class Member implements Serializable {
    private String userId;
    private String password;
    private String userName;

}
