package com.itstep.travel.controller.impl;

import com.itstep.travel.controller.BaseController;
import com.itstep.travel.facade.TravelFacade;
import com.itstep.travel.model.dto.TravelDto;
import com.itstep.travel.model.dto.TravelFilterDto;
import com.itstep.travel.model.dto.create.TravelCreateDto;
import com.itstep.travel.model.dto.update.TravelUpdateDto;
import com.itstep.travel.utils.PageableUtils;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

    @GetMapping("/all")
    public ResponseEntity<?> findAll(@RequestParam(name = "pageNumber", defaultValue = "1") int pageNumber,
                                     @RequestParam(name = "pageSize", defaultValue = "2") int pageSize,
                                     @RequestParam(name = "sortField", defaultValue = "") String sortField,
                                     @RequestParam(name = "sortOrder", defaultValue = "ASC") String sortOrder,
                                     @RequestParam(name = "typeId", required = false) Long typeId,
                                     @RequestParam(name = "transportId", required = false) Long transportId,
                                     @RequestParam(name = "feedId", required = false) Long feedId,
                                     @RequestParam(name = "daysCountFrom", required = false) Integer daysCountFrom,
                                     @RequestParam(name = "daysCountTo", required = false) Integer daysCountTo) {
        var pageable = PageableUtils.buildPageable(pageNumber, pageSize, sortField, sortOrder);
        var filter = new TravelFilterDto(typeId, transportId, feedId, daysCountFrom, daysCountTo);
        return new ResponseEntity<>(travelFacade.findAllTravels(pageable, filter), HttpStatus.OK);
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
