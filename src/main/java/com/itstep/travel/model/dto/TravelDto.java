package com.itstep.travel.model.dto;

import com.itstep.travel.model.dto.parent.BaseDto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TravelDto extends BaseDto {

    private TravelTypeDto type;
    private TravelTransportDto transport;
    private TravelFeedDto feed;
    private Integer daysCount;
}
