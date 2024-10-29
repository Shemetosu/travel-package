package com.itstep.travelpackage.model.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TravelDto {

    private Integer id;
    private String name;
    private Integer travelTypesId;
    private Integer travelTransportId;
    private Integer travelFeedId;
    private Integer daysCount;
}
