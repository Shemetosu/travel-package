package com.itstep.travel.controller.impl;

import com.itstep.travel.controller.BaseController;
import com.itstep.travel.facade.TravelFacade;
import com.itstep.travel.model.dto.TravelTypeDto;
import com.itstep.travel.model.dto.create.TravelTypeCreateDto;
import com.itstep.travel.model.dto.update.TravelTypeUpdateDto;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("/api/types")
public class TravelTypeController implements BaseController<TravelTypeDto, TravelTypeCreateDto, TravelTypeUpdateDto> {

    private final TravelFacade travelFacade;

    @Override
    public ResponseEntity<TravelTypeDto> findOne(Long id) {
        return new ResponseEntity<>(travelFacade.findOneTravelType(id), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<TravelTypeDto> create(TravelTypeCreateDto dto) {
        return new ResponseEntity<>(travelFacade.createTravelType(dto), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<TravelTypeDto> update(TravelTypeUpdateDto dto) {
        return new ResponseEntity<>(travelFacade.updateTravelType(dto), HttpStatus.OK);
    }

    @Override
    public void remove(Long id) {
        travelFacade.removeTravelTransport(id);
    }
}
