package com.itstep.travel.controller.impl;

import com.itstep.travel.controller.BaseController;
import com.itstep.travel.facade.TravelFacade;
import com.itstep.travel.model.dto.TravelTransportDto;
import com.itstep.travel.model.dto.create.TravelTransportCreateDto;
import com.itstep.travel.model.dto.update.TravelTransportUpdateDto;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("/api/transports")
public class TravelTransportController implements BaseController<TravelTransportDto, TravelTransportCreateDto, TravelTransportUpdateDto> {

    private final TravelFacade travelFacade;

    @Override
    public ResponseEntity<TravelTransportDto> findOne(Long id) {
        return new ResponseEntity<>(travelFacade.findOneTravelTransport(id), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<TravelTransportDto> create(TravelTransportCreateDto dto) {
        return new ResponseEntity<>(travelFacade.createTravelTransport(dto), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<TravelTransportDto> update(TravelTransportUpdateDto dto) {
        return new ResponseEntity<>(travelFacade.updateTravelTransport(dto), HttpStatus.OK);
    }

    @Override
    public void remove(Long id) {
        travelFacade.removeTravelTransport(id);
    }
}
