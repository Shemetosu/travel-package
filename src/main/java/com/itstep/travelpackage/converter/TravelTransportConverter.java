package com.itstep.travelpackage.converter;

import com.itstep.travelpackage.model.dto.TravelTransportDto;
import com.itstep.travelpackage.model.dto.create.TravelTransportCreateDto;
import com.itstep.travelpackage.model.dto.update.TravelTransportUpdateDto;
import com.itstep.travelpackage.model.entity.TravelTransport;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(
        componentModel = "spring",
        implementationPackage = "com.itstep.travelpackage.converter",
        uses = {
                TravelConverter.class
        }
)
public interface TravelTransportConverter {

    TravelTransportDto convert(TravelTransport source);

    TravelTransport convert(TravelTransportDto source);

    TravelTransport convert(TravelTransportCreateDto source);

    TravelTransport convert(TravelTransportUpdateDto source);

    List<TravelTransportDto> convert(List<TravelTransport> source);
}
