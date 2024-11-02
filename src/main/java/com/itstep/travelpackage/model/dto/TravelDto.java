package com.itstep.travelpackage.model.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TravelDto {

    private Long id;
    private String name;
    private TravelTypeDto type;
    private TravelTransportDto transport;
    private TravelFeedDto feed;
    private Integer daysCount;
}
