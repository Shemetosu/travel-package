package com.itstep.travelpackage.converter;

import com.itstep.travelpackage.model.dto.TravelFeedDto;
import com.itstep.travelpackage.model.dto.create.TravelFeedCreateDto;
import com.itstep.travelpackage.model.dto.update.TravelFeedUpdateDto;
import com.itstep.travelpackage.model.entity.TravelFeed;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(
        componentModel = "spring",
        implementationPackage = "com.itstep.travelpackage.converter",
        uses = {
                TravelConverter.class
        }
)
public interface TravelFeedConverter {

    TravelFeedDto convert(TravelFeed source);

    TravelFeed convert(TravelFeedDto source);

    TravelFeed convert(TravelFeedCreateDto source);

    TravelFeed convert(TravelFeedUpdateDto source);

    List<TravelFeedDto> convert(List<TravelFeed> source);
}
