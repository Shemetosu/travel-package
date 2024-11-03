package com.itstep.travel.model.dto;

public record TravelFilterDto(
        Long typeId,
        Long transportId,
        Long feedId,
        Integer daysCountFrom,
        Integer daysCountTo
) {
}
