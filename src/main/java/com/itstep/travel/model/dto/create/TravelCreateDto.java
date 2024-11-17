package com.itstep.travel.model.dto.create;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

@Getter
@Setter
public class TravelCreateDto {

    private Long travelTypeId;
    private Long travelTransportId;
    private Long travelFeedId;

    @Length(min = 2, message = "Название путёвки не может быть менее 2 символов.")
    private String name;

    @Length(min = 1, message = "Продолжительность путёвки не может быть менее 1 дня.")
    private Integer daysCount;
}
