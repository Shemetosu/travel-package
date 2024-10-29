package com.itstep.travelpackage.model.dto.create;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TravelCreateDto {

    private Integer travelTypesId;
    private Integer travelTransportId;
    private Integer travelFeedId;
    private String name;
    private Integer daysCount;
}
