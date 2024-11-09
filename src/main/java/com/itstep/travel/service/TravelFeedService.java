package com.itstep.travel.service;

import com.itstep.travel.model.entity.TravelFeed;

import java.util.List;

public interface TravelFeedService extends BaseService<TravelFeed> {

    List<TravelFeed> findAll();
}
