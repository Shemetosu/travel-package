package com.itstep.travelpackage.service.impl;

import com.itstep.travelpackage.model.entity.Travel;
import com.itstep.travelpackage.repository.TravelRepository;
import com.itstep.travelpackage.service.TravelService;
import jakarta.persistence.EntityNotFoundException;
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
    public Travel findOne(Long id) {
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
    public Travel create(Travel entity) {
        return repository.save(entity);
    }

    @Override
    public Travel update(Travel entity) {
        return repository.save(entity);
    }

    @Override
    public void remove(Long id) {
        repository.deleteById(id);
    }
}
