package com.itstep.travelpackage.converter;

import com.itstep.travelpackage.model.dto.TravelDto;
import com.itstep.travelpackage.model.dto.create.TravelCreateDto;
import com.itstep.travelpackage.model.dto.update.TravelUpdateDto;
import com.itstep.travelpackage.model.entity.Travel;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(
        componentModel = "spring",
        implementationPackage = "com.itstep.travelpackage.converter.impl",
        uses = {
        TravelTypeConverter.class,
        TravelTransportConverter.class,
        TravelFeedConverter.class
}
)
public interface TravelConverter {

    TravelDto convert(Travel source);

    Travel convert(TravelDto source);

    Travel convert(TravelCreateDto source);

    Travel convert(TravelUpdateDto source);

    List<TravelDto> convert(List<Travel> source);
}
