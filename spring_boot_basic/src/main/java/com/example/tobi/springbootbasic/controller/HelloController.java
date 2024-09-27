package com.example.tobi.springbootbasic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/hello")
    public String Hello() {
        System.out.println("hello");
        return "hello";
    }
}
