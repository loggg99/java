package com.example.tobi.project1.controller;

import com.example.tobi.project1.model.SearchProduct;
import com.example.tobi.project1.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class CategoryController {

    private final ProductService productService;

    @GetMapping("/category/{categoryId}/{subCategoryId}")
    public String categoryDetail(@PathVariable("categoryId") Long categoryId,
                                 @PathVariable("subCategoryId") Long subCategoryId,
                                 Model model) {
        // 서브 카테고리 이름을 가져오는 메서드
        String subCategoryName = getSubCategoryNameById(categoryId, subCategoryId);
        model.addAttribute("subCategoryName", subCategoryName);
        // 해당 카테고리의 상품을 조회
        List<SearchProduct> products = productService.getProductsByCategoryAndSubCategory(categoryId, subCategoryId);
        model.addAttribute("products", products);
        // 모델에 서브 카테고리 이름과 상품 목록을 추가



        return "category-detail"; // category-detail 페이지에 전달
    }

    private String getSubCategoryNameById(Long categoryId, Long subCategoryId) {
        if (categoryId == 1) { // TOP 카테고리
            if (subCategoryId == 1) return "T-Shirts";
            if (subCategoryId == 2) return "Shirts";
            if (subCategoryId == 3) return "Sweaters";
        } else if (categoryId == 2) { // OUTER 카테고리
            if (subCategoryId == 1) return "Coats";
            if (subCategoryId == 2) return "Jackets";
            if (subCategoryId == 3) return "Hoodies";
        } else if (categoryId == 3) {
            if (subCategoryId == 1) return "Jeans";
            if (subCategoryId == 2) return "Slacks";
            if (subCategoryId == 3) return "Shorts";
        } else if (categoryId == 4) {
            if (subCategoryId == 1) return "Bags";
            if (subCategoryId == 2) return "Hats";
            if (subCategoryId == 3) return "Scarves";
        }

        return "기타";
    }




}
