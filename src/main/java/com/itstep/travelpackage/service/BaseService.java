package com.itstep.travelpackage.service;

import com.itstep.travelpackage.model.dto.TravelDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;

public interface BaseService<E> {

    TravelDto findOne(Integer id);

    Page<E> findAll(Pageable pageable);

    Page<E> findAll(Specification<E> specification, Pageable pageable);

    E create(E entity);

    E update(E entity);

    void remove(Integer id);
}