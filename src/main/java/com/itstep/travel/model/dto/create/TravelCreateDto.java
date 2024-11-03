package com.itstep.travel.model.dto.create;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TravelCreateDto {

    private Long travelTypeId;
    private Long travelTransportId;
    private Long travelFeedId;
    private String name;
    private Integer daysCount;
}
