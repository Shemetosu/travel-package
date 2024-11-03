package com.itstep.travel.service.impl;

import com.itstep.travel.exception.NotImplementedException;
import com.itstep.travel.model.entity.TravelType;
import com.itstep.travel.repository.TravelTypeRepository;
import com.itstep.travel.service.TravelTypeService;
import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.List;

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
    public List<TravelType> findAll() {
        return repository.findAll();
    }

    @Override
    public Page<TravelType> findAll(Specification<TravelType> specification, Pageable pageable) {
        throw new NotImplementedException("Not implemented");
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
