package com.itstep.travel.service;

public interface BaseService<E> {

    E findOne(Long id);

    E create(E entity);

    E update(E entity);

    void remove(Long id);
}
