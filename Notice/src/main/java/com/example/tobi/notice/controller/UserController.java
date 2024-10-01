package com.example.tobi.notice.controller;

import ch.qos.logback.core.model.Model;
import com.example.tobi.notice.dto.UserDTO;
import com.example.tobi.notice.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserController {

    private final UserService userService;


    @GetMapping("/register")
    public String resisterForm() {
        return "sign-up";
    }

    @PostMapping("/register")
    public String resister(UserDTO userDTO) {
        userService.registerUser(userDTO);
        return "redirect:/users/login";

    }

    @GetMapping("/login")
    public String loginForm() {
        return "login";
    }

    @PostMapping("/login")
    public String login(UserDTO userDTO) {
        boolean isLoginSuc = userService.login(userDTO);
        if (isLoginSuc) {
            return "redirect:/notices";
        } else {

            return "login";
        }


    }









}
