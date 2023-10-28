package com.gamecard.gamecard.common.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public abstract class BaseDTO {

    private Date createAt;

    private Date updateAt;
}
