package com.example.tobi.himedia_shop.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class CategoryController {

    @GetMapping("/category/{id}")
    public String categoryDetail(@PathVariable("id") Long id) {
        // id에 따른 카테고리 정보를 처리하는 로직을 넣을 수 있음
        return "category-detail";  // category-detail.html 템플릿을 반환
    }




}
