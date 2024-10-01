package com.example.tobi.notice.model;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.RequestMapping;

@Setter
@Getter
@Builder
public class User {
    private String id;
    private String name;
    private String email;
    private String phone;
    private String password;



}
