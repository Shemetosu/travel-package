package com.itstep.travelpackage.service.impl;

import com.itstep.travelpackage.model.entity.TravelTransport;
import com.itstep.travelpackage.repository.TravelTransportRepository;
import com.itstep.travelpackage.service.TravelTransportService;
import jakarta.persistence.EntityNotFoundException;
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
    public TravelTransport findOne(Integer id) {
        return repository.findById(id).orElseThrow(
                () -> new EntityNotFoundException("Transport of travel not found by id: " + id)
        );
    }

    @Override
    public Page findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Override
    public Page findAll(Specification specification, Pageable pageable) {
        return repository.findAll(specification, pageable);
    }

    @Override
    public TravelTransport create(TravelTransport entity) {
        return repository.save(entity);
    }

    @Override
    public TravelTransport update(TravelTransport entity) {
        return repository.save(entity);
    }

    @Override
    public void remove(Integer id) {
        repository.deleteById(id);
    }
}
