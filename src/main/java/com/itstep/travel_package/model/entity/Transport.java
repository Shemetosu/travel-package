package com.itstep.travel_package.model.entity;

import com.itstep.travel_package.model.entity.parent.NameEntity;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class Transport extends NameEntity {

    public LocalDateTime dateArrival;
    public LocalDateTime dateDeparture;
}
