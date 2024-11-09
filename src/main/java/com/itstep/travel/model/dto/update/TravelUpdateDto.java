package com.itstep.travel.model.dto.update;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TravelUpdateDto {

    @NotNull
    @Min(1)
    private Long id;

    @NotNull
//    @CheckEx(validator = CheckExistsTravelById.class)
    private Long travelTypeId;

    @NotNull
//    @CheckEx(validator = CheckExistsTransportById.class)
    private Long travelTransportId;

    @NotNull
//    @CheckEx(validator = CheckExistsFeedById.class)
    private Long travelFeedId;

    private String name;
    private Integer daysCount;
}
