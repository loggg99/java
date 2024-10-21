package com.example.tobi.project1.mapper;

import com.example.tobi.project1.model.SearchProduct;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface SearchProductMapper {
    List<SearchProduct> searchProducts (String keyword);

    List<SearchProduct> findProductsByCategoryAndSubCategory(Long categoryId, Long subCategoryId);
}
