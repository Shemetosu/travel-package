package com.itstep.travel_package.model.entity;

import com.itstep.travel_package.model.entity.parent.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class Date extends BaseEntity {

    private LocalDateTime dateArrival;
    private LocalDateTime dateDeparture;
    private String numberDays;
}
