package com.example.tobi.himedia_shop.project.controller;



import com.example.tobi.himedia_shop.project.model.Product;
import com.example.tobi.himedia_shop.project.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;
import java.util.List;

@Controller
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @GetMapping("/search")
    public String searchProducts(@RequestParam("q") String searchTerm, Model model) {
        List<Product> products = productService.searchProduct(searchTerm);
        model.addAttribute("products", products);
        return "search-results";
    }


}
