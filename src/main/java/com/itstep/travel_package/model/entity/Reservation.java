package com.itstep.travel_package.model.entity;

import com.itstep.travel_package.model.entity.parent.BaseEntity;

import java.time.LocalDateTime;
import java.util.UUID;

public class Reservation extends BaseEntity {

    private UUID userId;
    private UUID typesId;
    private UUID transportId;
    private UUID livingId;
    private UUID datesId;
    private LocalDateTime dateCreation;
    private LocalDateTime lastModified;

}
