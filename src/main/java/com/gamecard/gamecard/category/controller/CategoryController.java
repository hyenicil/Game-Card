package com.gamecard.gamecard.category.controller;

import com.gamecard.gamecard.category.dto.request.CategoryRequestDTO;
import com.gamecard.gamecard.category.dto.response.CategoryResponseDTO;
import com.gamecard.gamecard.category.entity.Category;
import com.gamecard.gamecard.category.mapper.CategoryMapper;
import com.gamecard.gamecard.category.service.CategoryService;
import com.gamecard.gamecard.common.controller.BaseController;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("blogs")
@RequiredArgsConstructor
public class CategoryController extends BaseController<Long, Category, CategoryRequestDTO, CategoryResponseDTO, CategoryService, CategoryMapper> {

    private final CategoryService categoryService;

    private final CategoryMapper categoryMapper;
    @Override
    protected CategoryService getService() {
        return categoryService;
    }
    @Override
    protected CategoryMapper getMapper() {
        return categoryMapper;
    }


}
