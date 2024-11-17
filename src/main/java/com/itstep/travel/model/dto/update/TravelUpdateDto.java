package com.itstep.travel.model.dto.update;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;


@Getter
@Setter
public class TravelUpdateDto {

    @NotNull
    @Min(1)
    private Long id;

    @NotNull
    private Long travelTypeId;

    @NotNull
    private Long travelTransportId;

    @NotNull
    private Long travelFeedId;

    @Length(min = 2, message = "Название путёвки не может быть менее 2 символов.")
    private String name;

    @Length(min = 1, message = "Продолжительность путёвки не может быть менее 1 дня.")
    private Integer daysCount;
}
