package com.itstep.travel_package.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;

public interface BaseDataService<E> {

    E findOne(Integer id);

    Page<E> findAll(Pageable pageable);

    Page<E> findAll(Specification<E> specification, Pageable pageable);

    E save(E entity);

    void remove(Integer id);
}
