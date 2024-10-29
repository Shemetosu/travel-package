package com.itstep.travelpackage.converter;

import com.itstep.travelpackage.model.dto.TravelTypeDto;
import com.itstep.travelpackage.model.dto.create.TravelTypeCreateDto;
import com.itstep.travelpackage.model.dto.update.TravelTypeUpdateDto;
import com.itstep.travelpackage.model.entity.TravelType;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(
        componentModel = "spring",
        implementationPackage = "com.itstep.travelpackage.converter",
        uses = {
                TravelConverter.class
        }
)
public interface TravelTypeConverter {

    TravelTypeDto convert(TravelType source);

    TravelType convert(TravelTypeDto source);

    TravelType convert(TravelTypeCreateDto source);

    TravelType convert(TravelTypeUpdateDto source);

    List<TravelTypeDto> convert(List<TravelType> source);
}
