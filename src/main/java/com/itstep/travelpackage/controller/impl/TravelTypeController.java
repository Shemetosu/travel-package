package com.itstep.travelpackage.controller.impl;

import com.itstep.travelpackage.controller.BaseController;
import com.itstep.travelpackage.facade.TravelFacade;
import com.itstep.travelpackage.model.dto.TravelTypeDto;
import com.itstep.travelpackage.model.dto.create.TravelTypeCreateDto;
import com.itstep.travelpackage.model.dto.update.TravelTypeUpdateDto;
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
    public ResponseEntity<TravelTypeDto> findOne(Integer id) {
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
    public void remove(Integer id) {
        travelFacade.removeTravelTransport(id);
    }
}
