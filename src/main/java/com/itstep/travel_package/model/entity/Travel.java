package com.itstep.travel_package.model.entity;

import com.itstep.travel_package.model.entity.parent.BaseEntity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Travel extends BaseEntity {

    private Integer travelTypesId;
    private Integer travelTransportId;
    private Integer travelFeedId;
    private Integer daysCount;
}
