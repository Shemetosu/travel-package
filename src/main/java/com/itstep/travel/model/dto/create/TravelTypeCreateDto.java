package com.itstep.travel.model.dto.create;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

@Getter
@Setter
public class TravelTypeCreateDto {

    @Length(min = 2, message = "Название типа путёвки не может быть менее 2 символов.")
    private String name;
}
