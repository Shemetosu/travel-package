package com.itstep.travelpackage.service.impl;

import com.itstep.travelpackage.model.entity.TravelType;
import com.itstep.travelpackage.repository.TravelTypeRepository;
import com.itstep.travelpackage.service.TravelTypeService;
import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class TravelTypeServiceImpl implements TravelTypeService {

    private TravelTypeRepository repository;

    @Override
    public TravelType findOne(Long id) {
        return repository.findById(id).orElseThrow(
                () -> new EntityNotFoundException("Type of travel not found by id: " + id)
        );
    }

    @Override
    public Page findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Override
    public Page findAll(Specification<TravelType> specification, Pageable pageable) {
        return repository.findAll(specification, pageable);
    }

    @Override
    public TravelType create(TravelType entity) {
        return repository.save(entity);
    }

    @Override
    public TravelType update(TravelType entity) {
        return repository.save(entity);
    }

    @Override
    public void remove(Long id) {
        repository.deleteById(id);
    }
}
