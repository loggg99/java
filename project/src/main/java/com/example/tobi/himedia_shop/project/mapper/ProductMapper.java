package com.example.tobi.himedia_shop.project.mapper;

import com.example.tobi.himedia_shop.project.model.Product;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ProductMapper {
    List<Product> searchProducts(
            @Param("searchTerm") String searchTerm);
}

