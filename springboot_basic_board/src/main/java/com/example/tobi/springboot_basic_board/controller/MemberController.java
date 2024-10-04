package com.example.tobi.springboot_basic_board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/member")
public class MemberController {

    @GetMapping("/join")
    public String signUp() {
        return "sign-up";

    }

    @GetMapping("/login")
    public String login() {
        return "sign-in";
    }
}
