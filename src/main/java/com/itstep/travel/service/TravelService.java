package com.itstep.travel.service;

import com.itstep.travel.model.entity.Travel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;

public interface TravelService extends BaseService<Travel> {

    Page<Travel> findAll(Specification<Travel> specification, Pageable pageable);
}
