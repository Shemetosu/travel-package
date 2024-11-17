package com.itstep.travel.model.dto.create;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

@Getter
@Setter
public class TravelFeedCreateDto {

    @Length(min = 2, message = "Название питания не может быть менее 2 символов.")
    private String name;
}
