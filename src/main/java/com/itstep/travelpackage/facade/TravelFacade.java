package com.itstep.travelpackage.facade;

import com.itstep.travelpackage.model.dto.TravelDto;
import com.itstep.travelpackage.model.dto.TravelFeedDto;
import com.itstep.travelpackage.model.dto.TravelTransportDto;
import com.itstep.travelpackage.model.dto.TravelTypeDto;
import com.itstep.travelpackage.model.dto.create.TravelCreateDto;
import com.itstep.travelpackage.model.dto.create.TravelFeedCreateDto;
import com.itstep.travelpackage.model.dto.create.TravelTransportCreateDto;
import com.itstep.travelpackage.model.dto.create.TravelTypeCreateDto;
import com.itstep.travelpackage.model.dto.update.TravelFeedUpdateDto;
import com.itstep.travelpackage.model.dto.update.TravelTransportUpdateDto;
import com.itstep.travelpackage.model.dto.update.TravelTypeUpdateDto;
import com.itstep.travelpackage.model.dto.update.TravelUpdateDto;

public interface TravelFacade {

    TravelDto findOneTravel(Long id);

    TravelDto createTravel(TravelCreateDto dto);

    TravelDto updateTravel(TravelUpdateDto dto);

    void removeTravel(Long id);

    //--

    TravelTypeDto findOneTravelType(Long id);

    TravelTypeDto createTravelType(TravelTypeCreateDto dto);

    TravelTypeDto updateTravelType(TravelTypeUpdateDto dto);

    void removeTravelType(Long id);

    //--

    TravelTransportDto findOneTravelTransport(Long id);

    TravelTransportDto createTravelTransport(TravelTransportCreateDto dto);

    TravelTransportDto updateTravelTransport(TravelTransportUpdateDto dto);

    void removeTravelTransport(Long id);

    //--

    TravelFeedDto findOneTravelFeed(Long id);

    TravelFeedDto createTravelFeed(TravelFeedCreateDto dto);

    TravelFeedDto updateTravelFeed(TravelFeedUpdateDto dto);

    void removeTravelFeed(Long id);

    //--
}
