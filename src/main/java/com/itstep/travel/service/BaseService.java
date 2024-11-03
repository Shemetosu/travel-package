package com.itstep.travel.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;

import java.util.List;

public interface BaseService<E> {

    E findOne(Long id);

    List<E> findAll();

    Page<E> findAll(Specification<E> specification, Pageable pageable);

    E create(E entity);

    E update(E entity);

    void remove(Long id);
}
