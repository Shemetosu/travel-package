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
import com.itstep.travel.model.entity.TravelFeed;
import com.itstep.travel.model.entity.TravelTransport;
import com.itstep.travel.model.entity.TravelType;
import com.itstep.travel.repository.specification.TravelSpecification;
import com.itstep.travel.service.TravelFeedService;
import com.itstep.travel.service.TravelService;
import com.itstep.travel.service.TravelTransportService;
import com.itstep.travel.service.TravelTypeService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;

import java.util.List;

@Slf4j
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
        log.info("Найдена путёвка по ID = {}.", id);
        return travelConverter.convert(travelService.findOne(id));
    }

    @Override
    public List<TravelDto> findAllTravels(Pageable pageable, TravelFilterDto filter) {
        Page<Travel> travelPage = travelService.findAll(
                Specification.where(TravelSpecification.findAll(filter)),
                pageable
        );
        log.info("Отобрано записей = {}, страница = {}.", travelPage.getContent().size(), pageable.getPageNumber());
        return travelConverter.convert(travelPage.getContent());
    }

    @Override
    public TravelDto createTravel(TravelCreateDto dto) {
        Travel travel = travelConverter.convert(dto);
        travel.setTravelType(travelTypeService.findOne(dto.getTravelTypeId()));
        travel.setTravelTransport(travelTransportService.findOne(dto.getTravelTransportId()));
        travel.setTravelFeed(travelFeedService.findOne(dto.getTravelFeedId()));
        log.info("Новая путёвка с названием = {}, успешно создана.", dto.getName());
        return travelConverter.convert(travelService.create(travel));
    }

    @Override
    public TravelDto updateTravel(TravelUpdateDto dto) {
        Travel travel = travelService.findOne(dto.getId());
        travel = travelConverter.convert(dto, travel);
        travel.setTravelType(travelTypeService.findOne(dto.getTravelTypeId()));
        travel.setTravelTransport(travelTransportService.findOne(dto.getTravelTransportId()));
        travel.setTravelFeed(travelFeedService.findOne(dto.getTravelFeedId()));
        log.info("Путёвка по ID = {}, успешно обновлена.", dto.getId());
        return travelConverter.convert(travelService.update(travel));
    }

    @Override
    public void removeTravel(Long id) {
        travelService.remove(id);
        log.info("Путёвка по ID = {}, успешно удалена.", id);
    }

    //---

    @Override
    public TravelTypeDto findOneTravelType(Long id) {
        log.info("Найден тип путёвки по ID = {}.", id);
        return travelTypeConverter.convert(travelTypeService.findOne(id));
    }

    @Override
    public List<TravelTypeDto> findAllTravelTypes() {
        log.info("Отобрано записей = {}.", travelTypeService.findAll().size());
        return travelTypeConverter.convert(travelTypeService.findAll());
    }

    @Override
    public TravelTypeDto createTravelType(TravelTypeCreateDto dto) {
        log.info("Новый тип путёвки с названием = {}, успешно создан.", dto.getName());
        return travelTypeConverter.convert(
                travelTypeService.create(
                        travelTypeConverter.convert(dto)
                )
        );
    }

    @Override
    public TravelTypeDto updateTravelType(TravelTypeUpdateDto dto) {
        TravelType type = travelTypeService.findOne(dto.getId());
        type = travelTypeConverter.convert(dto, type);
        log.info("Тип путёвки по ID = {}, успешно обновлён.", dto.getId());
        return travelTypeConverter.convert(travelTypeService.update(type));
    }

    @Override
    public void removeTravelType(Long id) {
        travelTypeService.remove(id);
        log.info("Тип путёвки по ID = {}, успешно удалён.", id);
    }

    //---

    @Override
    public TravelTransportDto findOneTravelTransport(Long id) {
        log.info("Найден транспорт путёвки по ID = {}.", id);
        return travelTransportConverter.convert(travelTransportService.findOne(id));
    }

    @Override
    public List<TravelTransportDto> findAllTravelTransports() {
        log.info("Отобрано записей = {}.", travelTransportService.findAll().size());
        return travelTransportConverter.convert(travelTransportService.findAll());
    }

    @Override
    public TravelTransportDto createTravelTransport(TravelTransportCreateDto dto) {
        log.info("Новый транспорт путёвки с названием = {}, успешно создан.", dto.getName());
        return travelTransportConverter.convert(
                travelTransportService.create(
                        travelTransportConverter.convert(dto)
                )
        );
    }

    @Override
    public TravelTransportDto updateTravelTransport(TravelTransportUpdateDto dto) {
        TravelTransport transport = travelTransportService.findOne(dto.getId());
        transport = travelTransportConverter.convert(dto, transport);
        log.info("Транспорт путёвки по ID = {}, успешно обновлён.", dto.getId());
        return travelTransportConverter.convert(travelTransportService.update(transport));
    }

    @Override
    public void removeTravelTransport(Long id) {
        travelTransportService.remove(id);
        log.info("Транспорт путёвки по ID = {}, успешно удалён.", id);
    }

    //---

    @Override
    public TravelFeedDto findOneTravelFeed(Long id) {
        log.info("Найдено питание путёвки по ID = {}.", id);
        return travelFeedConverter.convert(travelFeedService.findOne(id));
    }

    @Override
    public List<TravelFeedDto> findAllTravelFeeds() {
        log.info("Отобрано записей = {}.", travelFeedService.findAll().size());
        return travelFeedConverter.convert(travelFeedService.findAll());
    }

    @Override
    public TravelFeedDto createTravelFeed(TravelFeedCreateDto dto) {
        log.info("Новое питание путёвки с названием = {}, успешно создано.", dto.getName());
        return travelFeedConverter.convert(
                travelFeedService.create(
                        travelFeedConverter.convert(dto)
                )
        );
    }

    @Override
    public TravelFeedDto updateTravelFeed(TravelFeedUpdateDto dto) {
        TravelFeed feed = travelFeedService.findOne(dto.getId());
        feed = travelFeedConverter.convert(dto, feed);
        log.info("Питание путёвки по ID = {}, успешно обновлено.", dto.getId());
        return travelFeedConverter.convert(travelFeedService.update(feed));
    }

    @Override
    public void removeTravelFeed(Long id) {
        travelFeedService.remove(id);
        log.info("Питание путёвки по ID = {}, успешно удалено.", id);
    }
}
