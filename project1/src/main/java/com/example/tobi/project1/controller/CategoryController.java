package com.example.tobi.project1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class CategoryController {

    @GetMapping("/category/{id}")
    public String categoryDetail(@PathVariable("id") Long id) {

        return "category-detail";
    }




}
