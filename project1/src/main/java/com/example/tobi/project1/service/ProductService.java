package com.example.tobi.project1.service;

import com.example.tobi.project1.mapper.SearchProductMapper;
import com.example.tobi.project1.model.SearchProduct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final SearchProductMapper searchProductMapper;

    public List<SearchProduct> getProductsByCategoryAndSubCategory(Long categoryId, Long subCategoryId) {
        return searchProductMapper.findProductsByCategoryAndSubCategory(categoryId, subCategoryId);
    }
}
