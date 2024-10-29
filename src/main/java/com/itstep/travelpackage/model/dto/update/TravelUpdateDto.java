package com.itstep.travelpackage.model.dto.update;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TravelUpdateDto {

    private Integer id;
    private Integer travelTypesId;
    private Integer travelTransportId;
    private Integer travelFeedId;
    private String name;
    private Integer daysCount;
}
