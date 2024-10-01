package com.example.tobi.notice.controller;


import com.example.tobi.notice.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
@RequestMapping("/notices")
public class NoticeController {

    private final UserService userService;

    @GetMapping
    public String noticesList(@RequestParam


    ) {

        return "notice-list";

    }



    @GetMapping("/register")
    public String registerForm() {
        return "sign-up";
    }

}
