package com.itstep.travel.controller.impl;

import com.itstep.travel.controller.BaseController;
import com.itstep.travel.facade.TravelFacade;
import com.itstep.travel.model.dto.TravelFeedDto;
import com.itstep.travel.model.dto.create.TravelFeedCreateDto;
import com.itstep.travel.model.dto.update.TravelFeedUpdateDto;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("/api/feeds")
public class TravelFeedController implements BaseController<TravelFeedDto, TravelFeedCreateDto, TravelFeedUpdateDto> {

    private final TravelFacade travelFacade;

    @Override
    public ResponseEntity<TravelFeedDto> findOne(Long id) {
        return new ResponseEntity<>(travelFacade.findOneTravelFeed(id), HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<?> findAll() {
        return new ResponseEntity<>(travelFacade.findAllTravelFeeds(), HttpStatus.OK);
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
    public void remove(Long id) {
        travelFacade.removeTravelFeed(id);
    }
}
