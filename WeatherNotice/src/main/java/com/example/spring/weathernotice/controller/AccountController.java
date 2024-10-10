package com.example.spring.weathernotice.controller;

import com.example.spring.weathernotice.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor

public class AccountController {

    private final AccountService accountService;

    @GetMapping("/register")
    public String registerForm() {
        return "register";


    }

    @GetMapping("/login")
    public String loginForm() {
        return "login";
    }



}
