package com.itstep.travel_package.service.impl;

import com.itstep.travel_package.repository.TravelRepository;
import com.itstep.travel_package.service.TravelService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class TravelServiceImpl implements TravelService {

    private TravelRepository repository;

    @Override
    public Object findOne(Integer id) {
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
    public Object save(Object entity) {
        return null;
    }

    @Override
    public void remove(Integer id) {
        repository.deleteById(id);
    }
}
