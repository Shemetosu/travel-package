package com.itstep.travelpackage.model.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TravelDto {

    private Long id;
    private String name;
    private Long travelTypeId;
    private Long travelTransportId;
    private Long travelFeedId;
    private Long daysCount;
}
