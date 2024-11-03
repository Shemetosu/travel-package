package com.itstep.travel.facade;

import com.itstep.travel.model.dto.*;
import com.itstep.travel.model.dto.create.TravelCreateDto;
import com.itstep.travel.model.dto.create.TravelFeedCreateDto;
import com.itstep.travel.model.dto.create.TravelTransportCreateDto;
import com.itstep.travel.model.dto.create.TravelTypeCreateDto;
import com.itstep.travel.model.dto.update.TravelFeedUpdateDto;
import com.itstep.travel.model.dto.update.TravelTransportUpdateDto;
import com.itstep.travel.model.dto.update.TravelTypeUpdateDto;
import com.itstep.travel.model.dto.update.TravelUpdateDto;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface TravelFacade {

    TravelDto findOneTravel(Long id);

    List<TravelDto> findAllTravels(Pageable pageable, TravelFilterDto filter);

    TravelDto createTravel(TravelCreateDto dto);

    TravelDto updateTravel(TravelUpdateDto dto);

    void removeTravel(Long id);

    //--

    TravelTypeDto findOneTravelType(Long id);

    List<TravelTypeDto> findAllTravelTypes();

    TravelTypeDto createTravelType(TravelTypeCreateDto dto);

    TravelTypeDto updateTravelType(TravelTypeUpdateDto dto);

    void removeTravelType(Long id);

    //--

    TravelTransportDto findOneTravelTransport(Long id);

    List<TravelTransportDto> findAllTravelTransports();

    TravelTransportDto createTravelTransport(TravelTransportCreateDto dto);

    TravelTransportDto updateTravelTransport(TravelTransportUpdateDto dto);

    void removeTravelTransport(Long id);

    //--

    TravelFeedDto findOneTravelFeed(Long id);

    List<TravelFeedDto> findAllTravelFeeds();

    TravelFeedDto createTravelFeed(TravelFeedCreateDto dto);

    TravelFeedDto updateTravelFeed(TravelFeedUpdateDto dto);

    void removeTravelFeed(Long id);
}
