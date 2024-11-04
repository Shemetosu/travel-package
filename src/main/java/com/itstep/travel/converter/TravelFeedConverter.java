package com.itstep.travel.converter;

import com.itstep.travel.model.dto.TravelFeedDto;
import com.itstep.travel.model.dto.create.TravelFeedCreateDto;
import com.itstep.travel.model.dto.update.TravelFeedUpdateDto;
import com.itstep.travel.model.entity.TravelFeed;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import java.util.List;

@Mapper(
        componentModel = "spring",
        implementationPackage = "com.itstep.travel.converter.impl"
)
public interface TravelFeedConverter {

    TravelFeedDto convert(TravelFeed source);

    List<TravelFeedDto> convert(List<TravelFeed> source);

    TravelFeed convert(TravelFeedCreateDto source);

    TravelFeed convert(TravelFeedUpdateDto dto, @MappingTarget TravelFeed entity);
}
