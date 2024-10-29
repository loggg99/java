package com.example.spring.redis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/member")
public class MemberController {

    @GetMapping("/join")
    public String signUp() {
        System.out.println("hihihi");
        return "sign-up";
    }

    @GetMapping("/login")
    public String signIn() {

        return "sign-in";
    }

}
