package com.itstep.travelpackage.service.impl;

import com.itstep.travelpackage.model.entity.TravelFeed;
import com.itstep.travelpackage.repository.TravelFeedRepository;
import com.itstep.travelpackage.service.TravelFeedService;
import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class TravelFeedServiceImpl implements TravelFeedService {

    private TravelFeedRepository repository;

    @Override
    public TravelFeed findOne(Long id) {
        return repository.findById(id).orElseThrow(
                () -> new EntityNotFoundException("Feed of Travel not found by id: " + id)
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
    public TravelFeed create(TravelFeed entity) {
        return repository.save(entity);
    }

    @Override
    public TravelFeed update(TravelFeed entity) {
        return repository.save(entity);
    }

    @Override
    public void remove(Long id) {
        repository.deleteById(id);
    }
}
