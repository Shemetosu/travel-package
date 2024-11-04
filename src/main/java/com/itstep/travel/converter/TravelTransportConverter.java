package com.itstep.travel.converter;

import com.itstep.travel.model.dto.TravelTransportDto;
import com.itstep.travel.model.dto.create.TravelTransportCreateDto;
import com.itstep.travel.model.dto.update.TravelTransportUpdateDto;
import com.itstep.travel.model.entity.TravelTransport;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import java.util.List;

@Mapper(
        componentModel = "spring",
        implementationPackage = "com.itstep.travel.converter.impl"
)
public interface TravelTransportConverter {

    TravelTransportDto convert(TravelTransport source);

    List<TravelTransportDto> convert(List<TravelTransport> source);

    TravelTransport convert(TravelTransportCreateDto source);

    TravelTransport convert(TravelTransportUpdateDto dto, @MappingTarget TravelTransport entity);
}
