package com.itstep.travel.facade.impl;

import com.itstep.travel.converter.TravelConverter;
import com.itstep.travel.converter.TravelFeedConverter;
import com.itstep.travel.converter.TravelTransportConverter;
import com.itstep.travel.converter.TravelTypeConverter;
import com.itstep.travel.facade.TravelFacade;
import com.itstep.travel.model.dto.*;
import com.itstep.travel.model.dto.create.TravelCreateDto;
import com.itstep.travel.model.dto.create.TravelFeedCreateDto;
import com.itstep.travel.model.dto.create.TravelTransportCreateDto;
import com.itstep.travel.model.dto.create.TravelTypeCreateDto;
import com.itstep.travel.model.dto.update.TravelFeedUpdateDto;
import com.itstep.travel.model.dto.update.TravelTransportUpdateDto;
import com.itstep.travel.model.dto.update.TravelTypeUpdateDto;
import com.itstep.travel.model.dto.update.TravelUpdateDto;
import com.itstep.travel.model.entity.Travel;
import com.itstep.travel.repository.specification.TravelSpecification;
import com.itstep.travel.service.TravelFeedService;
import com.itstep.travel.service.TravelService;
import com.itstep.travel.service.TravelTransportService;
import com.itstep.travel.service.TravelTypeService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;

import java.util.List;

@AllArgsConstructor
@Component
public class TravelFacadeImp implements TravelFacade {

    private final TravelService travelService;
    private final TravelTypeService travelTypeService;
    private final TravelTransportService travelTransportService;
    private final TravelFeedService travelFeedService;
    private final TravelConverter travelConverter;
    private final TravelTypeConverter travelTypeConverter;
    private final TravelTransportConverter travelTransportConverter;
    private final TravelFeedConverter travelFeedConverter;

    //---

    @Override
    public TravelDto findOneTravel(Long id) {
        return travelConverter.convert(travelService.findOne(id));
    }

    @Override
    public List<TravelDto> findAllTravels(Pageable pageable, TravelFilterDto filter) {
        Page<Travel> travelPage = travelService.findAll(
               Specification.where(TravelSpecification.findAll(filter)),
               pageable
        );
        return travelConverter.convert(travelPage.getContent());
    }

    @Override
    public TravelDto createTravel(TravelCreateDto dto) {
        Travel travel = travelConverter.convert(dto);
        travel.setTravelType(travelTypeService.findOne(dto.getTravelTypeId()));
        travel.setTravelTransport(travelTransportService.findOne(dto.getTravelTransportId()));
        travel.setTravelFeed(travelFeedService.findOne(dto.getTravelFeedId()));
        return travelConverter.convert(
                travelService.create(
                        travelConverter.convert(travel)
                )
        );
    }

    @Override
    public TravelDto updateTravel(TravelUpdateDto dto) {
        Travel travel = travelService.findOne(dto.getId());
        travel = travelConverter.convert(dto, travel);
        travel.setTravelType(travelTypeService.findOne(dto.getTravelTypeId()));
        travel.setTravelTransport(travelTransportService.findOne(dto.getTravelTransportId()));
        travel.setTravelFeed(travelFeedService.findOne(dto.getTravelFeedId()));
        return travelConverter.convert(travelService.update(travel));
    }

    @Override
    public void removeTravel(Long id) {
        travelService.remove(id);
    }

    //---

    @Override
    public TravelTypeDto findOneTravelType(Long id) {
        return travelTypeConverter.convert(travelTypeService.findOne(id));
    }

    @Override
    public List<TravelTypeDto> findAllTravelTypes() {
        return List.of();
    }

    @Override
    public TravelTypeDto createTravelType(TravelTypeCreateDto dto) {
        return travelTypeConverter.convert(
                travelTypeService.create(
                        travelTypeConverter.convert(dto)
                )
        );
    }

    @Override
    public TravelTypeDto updateTravelType(TravelTypeUpdateDto dto) {
        return null;
    }

    @Override
    public void removeTravelType(Long id) {
        travelTypeService.remove(id);
    }

    //---

    @Override
    public TravelTransportDto findOneTravelTransport(Long id) {
        return travelTransportConverter.convert(travelTransportService.findOne(id));
    }

    @Override
    public List<TravelTransportDto> findAllTravelTransports() {
        return List.of();
    }

    @Override
    public TravelTransportDto createTravelTransport(TravelTransportCreateDto dto) {
        return travelTransportConverter.convert(
                travelTransportService.create(
                        travelTransportConverter.convert(dto)
                )
        );
    }

    @Override
    public TravelTransportDto updateTravelTransport(TravelTransportUpdateDto dto) {
        return null;
    }

    @Override
    public void removeTravelTransport(Long id) {
        travelTransportService.remove(id);
    }

    //---

    @Override
    public TravelFeedDto findOneTravelFeed(Long id) {
        return travelFeedConverter.convert(travelFeedService.findOne(id));
    }

    @Override
    public List<TravelFeedDto> findAllTravelFeeds() {
        return List.of();
    }

    @Override
    public TravelFeedDto createTravelFeed(TravelFeedCreateDto dto) {
        return travelFeedConverter.convert(
                travelFeedService.create(
                        travelFeedConverter.convert(dto)
                )
        );
    }

    @Override
    public TravelFeedDto updateTravelFeed(TravelFeedUpdateDto dto) {
        return null;
    }

    @Override
    public void removeTravelFeed(Long id) {
        travelFeedService.remove(id);
    }
}
