package com.itstep.travel.converter;

import com.itstep.travel.model.dto.TravelTypeDto;
import com.itstep.travel.model.dto.create.TravelTypeCreateDto;
import com.itstep.travel.model.dto.update.TravelTypeUpdateDto;
import com.itstep.travel.model.entity.TravelType;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import java.util.List;

@Mapper(
        componentModel = "spring",
        implementationPackage = "com.itstep.travel.converter.impl"
)
public interface TravelTypeConverter {

    TravelTypeDto convert(TravelType source);

    List<TravelTypeDto> convert(List<TravelType> source);

    TravelType convert(TravelTypeCreateDto source);

    TravelType convert(TravelTypeUpdateDto dto, @MappingTarget TravelType entity);
}
