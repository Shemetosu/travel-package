package com.itstep.travelpackage.model.dto.update;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TravelUpdateDto {

    private Long id;
    private Long travelTypeId;
    private Long travelTransportId;
    private Long travelFeedId;
    private String name;
    private Long daysCount;
}
