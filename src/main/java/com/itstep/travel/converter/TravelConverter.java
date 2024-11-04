package com.itstep.travel.converter;

import com.itstep.travel.model.dto.TravelDto;
import com.itstep.travel.model.dto.create.TravelCreateDto;
import com.itstep.travel.model.dto.update.TravelUpdateDto;
import com.itstep.travel.model.entity.Travel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(
        componentModel = "spring",
        implementationPackage = "com.itstep.travel.converter.impl",
        uses = {
                TravelTypeConverter.class,
                TravelTransportConverter.class,
                TravelFeedConverter.class
        }
)
public interface TravelConverter {

    @Mappings({
            @Mapping(source = "travelType", target = "type"),
            @Mapping(source = "travelTransport", target = "transport"),
            @Mapping(source = "travelFeed", target = "feed")
    })
    TravelDto convert(Travel source);

    List<TravelDto> convert(List<Travel> source);

    Travel convert(TravelCreateDto source);

    Travel convert(TravelUpdateDto dto, @MappingTarget Travel entity);

}
