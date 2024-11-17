package com.itstep.travel.model.dto.create;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

@Getter
@Setter
public class TravelTransportCreateDto {

    @Length(min = 2, message = "Название транспорта не может быть менее 2 символов.")
    private String name;
}
