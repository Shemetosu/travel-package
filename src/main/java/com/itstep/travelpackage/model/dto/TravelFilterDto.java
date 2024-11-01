package com.itstep.travelpackage.model.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TravelFilterDto {

    private Long travelTypeId;
    private Long travelTransportId;
    private Long travelFeedId;
    private Long daysCountFrom;
    private Long daysCountTo;
}
