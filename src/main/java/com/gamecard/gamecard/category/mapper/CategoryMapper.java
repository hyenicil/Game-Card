package com.gamecard.gamecard.category.mapper;

import com.gamecard.gamecard.category.dto.request.CategoryRequestDTO;
import com.gamecard.gamecard.category.dto.response.CategoryResponseDTO;
import com.gamecard.gamecard.category.entity.Category;
import com.gamecard.gamecard.common.mapper.BaseMapper;
import org.mapstruct.Mapper;

import static org.mapstruct.InjectionStrategy.CONSTRUCTOR;
import static org.mapstruct.MappingConstants.ComponentModel.SPRING;

@Mapper(componentModel = SPRING,uses={CategoryMapper.class},injectionStrategy = CONSTRUCTOR)
public interface CategoryMapper extends BaseMapper<Category, CategoryRequestDTO, CategoryResponseDTO> {




}
