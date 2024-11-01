package com.itstep.travelpackage.controller.impl;

import com.itstep.travelpackage.controller.BaseController;
import com.itstep.travelpackage.facade.TravelFacade;
import com.itstep.travelpackage.model.dto.TravelDto;
import com.itstep.travelpackage.model.dto.create.TravelCreateDto;
import com.itstep.travelpackage.model.dto.update.TravelUpdateDto;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("/api/travels")
public class TravelController implements BaseController<TravelDto, TravelCreateDto, TravelUpdateDto> {

    private final TravelFacade travelFacade;

    @Override
    public ResponseEntity<TravelDto> findOne(Long id) {
        return new ResponseEntity<>(travelFacade.findOneTravel(id), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<TravelDto> create(TravelCreateDto dto) {
        return new ResponseEntity<>(travelFacade.createTravel(dto), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<TravelDto> update(TravelUpdateDto dto) {
        return new ResponseEntity<>(travelFacade.updateTravel(dto), HttpStatus.OK);
    }

    @Override
    public void remove(Long id) {
        travelFacade.removeTravel(id);
    }
}
