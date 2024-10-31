package com.itstep.travelpackage.controller.impl;

import com.itstep.travelpackage.controller.BaseController;
import com.itstep.travelpackage.facade.TravelFacade;
import com.itstep.travelpackage.model.dto.TravelFeedDto;
import com.itstep.travelpackage.model.dto.create.TravelFeedCreateDto;
import com.itstep.travelpackage.model.dto.update.TravelFeedUpdateDto;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("/api/feeds")
public class TravelFeedController implements BaseController<TravelFeedDto, TravelFeedCreateDto, TravelFeedUpdateDto> {

    private final TravelFacade travelFacade;

    @Override
    public ResponseEntity<TravelFeedDto> findOne(Integer id) {
        return new ResponseEntity<>(travelFacade.findOneTravelFeed(id), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<TravelFeedDto> create(TravelFeedCreateDto dto) {
        return new ResponseEntity<>(travelFacade.createTravelFeed(dto), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<TravelFeedDto> update(TravelFeedUpdateDto dto) {
        return new ResponseEntity<>(travelFacade.updateTravelFeed(dto), HttpStatus.OK);
    }

    @Override
    public void remove(Integer id) {
        travelFacade.removeTravelFeed(id);
    }
}
