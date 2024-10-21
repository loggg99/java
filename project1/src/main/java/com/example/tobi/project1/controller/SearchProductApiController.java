package com.example.tobi.project1.controller;

import com.example.tobi.project1.model.SearchProduct;
import com.example.tobi.project1.service.SearchService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class SearchProductApiController {

    private final SearchService searchService;

    @GetMapping("/api/products/search")
    public List<SearchProduct> searchProducts(
            @RequestParam("keyword") String keyword) {
        return searchService.searchProducts(keyword);
    }
}
