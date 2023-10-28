package com.gamecard.gamecard.category.dto.request;

import com.gamecard.gamecard.common.dto.BaseDTO;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CategoryRequestDTO extends BaseDTO {
    private int id;
    private String name;

}
