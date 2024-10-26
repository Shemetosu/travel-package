package com.itstep.travel_package.controller.impl;

import com.itstep.travel_package.controller.BaseController;
import com.itstep.travel_package.model.dto.TravelDto;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("/api/travel")
public class TravelController implements BaseController<TravelDto> {

    @Override
    public ResponseEntity findOne(Integer id) {
        return null;
    }

    @Override
    public void remove(Integer id) {

    }
}
