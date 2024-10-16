package com.example.tobi.himedia_shop.project.service;

import com.example.tobi.himedia_shop.project.mapper.ProductMapper;
import com.example.tobi.himedia_shop.project.model.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductMapper productMapper;

    public List<Product> searchProduct(String searchTerm) {
        return productMapper.searchProducts(searchTerm);
    }

}

