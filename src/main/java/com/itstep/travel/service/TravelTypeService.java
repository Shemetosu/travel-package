package com.itstep.travel.service;

import com.itstep.travel.model.entity.TravelType;

import java.util.List;

public interface TravelTypeService extends BaseService<TravelType> {

    List<TravelType> findAll();
}
