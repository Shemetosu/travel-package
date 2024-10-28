package com.itstep.travel_package.model.dto.create;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TravelCreateDto {

    private String name;
    private Integer travelTypesId;
    private Integer travelTransportId;
    private Integer travelFeedId;
    private Integer daysCount;
}
