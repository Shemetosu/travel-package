package com.itstep.travelpackage.model.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TravelFilterDto {

    private Integer travelTypeId;
    private Integer travelTransportId;
    private Integer travelFeedId;
    private Integer daysCountFrom;
    private Integer daysCountTo;
}
