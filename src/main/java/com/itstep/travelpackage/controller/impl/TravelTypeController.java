package com.itstep.travelpackage.controller.impl;

import com.itstep.travelpackage.controller.BaseController;
import com.itstep.travelpackage.model.dto.TravelDto;
import com.itstep.travelpackage.model.dto.create.TravelCreateDto;
import com.itstep.travelpackage.model.dto.update.TravelUpdateDto;
import com.itstep.travelpackage.service.TravelTypeService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("/api/types")
public class TravelTypeController implements BaseController<TravelDto, TravelCreateDto, TravelUpdateDto> {

    private final TravelTypeService service;

    @Override
    public ResponseEntity<TravelDto> findOne(Integer id) {
        return new ResponseEntity<>(service.findOne(id), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<TravelDto> create(TravelCreateDto dto) {
        return null;
    }

    @Override
    public ResponseEntity<TravelDto> update(TravelUpdateDto dto) {
        return null;
    }

    @Override
    public void remove(Integer id) {
        service.remove(id);
    }
}
