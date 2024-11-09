package com.itstep.travel.service.impl;

import com.itstep.travel.model.entity.TravelTransport;
import com.itstep.travel.repository.TravelTransportRepository;
import com.itstep.travel.service.TravelTransportService;
import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class TravelTransportServiceImpl implements TravelTransportService {

    private TravelTransportRepository repository;

    @Override
    public TravelTransport findOne(Long id) {
        return repository.findById(id).orElseThrow(
                () -> new EntityNotFoundException("Transport of travel not found by id: " + id)
        );
    }

    @Override
    public List<TravelTransport> findAll() {
        return repository.findAll();
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
    public void remove(Long id) {
        repository.deleteById(id);
    }
}
