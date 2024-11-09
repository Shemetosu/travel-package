package com.itstep.travel.service.impl;

import com.itstep.travel.model.entity.Travel;
import com.itstep.travel.repository.TravelRepository;
import com.itstep.travel.service.TravelService;
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
    public Page<Travel> findAll(Specification<Travel> specification, Pageable pageable) {
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
