package com.itstep.travel.service.impl;

import com.itstep.travel.model.entity.TravelFeed;
import com.itstep.travel.repository.TravelFeedRepository;
import com.itstep.travel.service.TravelFeedService;
import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import com.itstep.travel.exception.NotImplementedException;

import java.util.List;

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
    public List<TravelFeed> findAll() {
        return repository.findAll();
    }

    @Override
    public Page<TravelFeed> findAll(Specification<TravelFeed> specification, Pageable pageable) {
        throw new NotImplementedException("Not implemented");
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
