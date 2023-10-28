package com.gamecard.gamecard.category.service;

import com.gamecard.gamecard.category.entity.Category;
import com.gamecard.gamecard.category.repository.CategoryRepository;
import com.gamecard.gamecard.common.repository.BaseRepository;
import com.gamecard.gamecard.common.service.BaseService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public  class CategoryService extends BaseService<Category, Long> {

    private final CategoryRepository categoryRepository;

    @Override
    public BaseRepository<Category, Long> getRepository() {
        return categoryRepository;
    }


}

