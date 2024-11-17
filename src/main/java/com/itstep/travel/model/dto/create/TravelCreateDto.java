package com.itstep.travel.model.dto.create;

import com.itstep.travel.model.entity.TravelFeed;
import com.itstep.travel.model.entity.TravelTransport;
import com.itstep.travel.model.entity.TravelType;
import com.itstep.travel.validate.CheckEx;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

@Getter
@Setter
public class TravelCreateDto {

    @NotNull
    @CheckEx(entityClass = TravelType.class)
    private Long travelTypeId;

    @NotNull
    @CheckEx(entityClass = TravelTransport.class)
    private Long travelTransportId;

    @NotNull
    @CheckEx(entityClass = TravelFeed.class)
    private Long travelFeedId;

    @Length(min = 2, message = "Название путёвки должно быть не менее двух символов.")
    private String name;

    @Min(value = 1, message = "Продолжительность путёвки не может быть менее 1 дня.")
    private Integer daysCount;
}
