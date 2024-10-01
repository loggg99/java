package com.example.tobi.springbootessential.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // controller restController???????????????
public class FilterController {

    @GetMapping("/Hello")
    public String Hello() {
        return "Hello";
    }

    @GetMapping("/api/data")
    public String data() {
        return "some data";
    }
}
