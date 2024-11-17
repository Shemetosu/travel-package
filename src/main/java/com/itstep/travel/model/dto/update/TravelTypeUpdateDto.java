package com.itstep.travel.model.dto.update;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

@Getter
@Setter
public class TravelTypeUpdateDto {

    private Long id;

    @Length(min = 2, message = "Название типа путёвки не может быть менее 2 символов.")
    private String name;
}
