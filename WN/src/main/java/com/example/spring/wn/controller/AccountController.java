package com.example.spring.wn.controller;


import lombok.RequiredArgsConstructor;
import com.example.spring.wn.service.AccountService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

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

