package com.itstep.travel.service;

import com.itstep.travel.model.entity.TravelTransport;

import java.util.List;

public interface TravelTransportService extends BaseService<TravelTransport> {

    List<TravelTransport> findAll();
}
