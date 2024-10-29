package com.itstep.travelpackage.service.impl;

import com.itstep.travelpackage.model.dto.TravelDto;
import com.itstep.travelpackage.repository.TravelTransportRepository;
import com.itstep.travelpackage.service.TravelTransportService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class TravelTransportServiceImpl implements TravelTransportService {

    private TravelTransportRepository repository;

    @Override
    public TravelDto findOne(Integer id) {
        return null;
    }

    @Override
    public Page findAll(Pageable pageable) {
        return null;
    }

    @Override
    public Page findAll(Specification specification, Pageable pageable) {
        return null;
    }

    @Override
    public Object create(Object entity) {
        return null;
    }

    @Override
    public Object update(Object entity) {
        return null;
    }

    @Override
    public void remove(Integer id) {
        repository.deleteById(id);
    }
}
