package com.itstep.travel_package.model.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TravelFilterDto {

    private Integer travelTypesId;
    private Integer travelTransportId;
    private Integer travelFeedId;
    private Integer daysCountFrom;
    private Integer daysCountTo;
}
