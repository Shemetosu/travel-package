package com.itstep.travel_package.model.dto.update;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TravelUpdateDto {

    private Integer id;
    private String name;
    private Integer travelTypesId;
    private Integer travelTransportId;
    private Integer travelFeedId;
    private Integer daysCount;
}
