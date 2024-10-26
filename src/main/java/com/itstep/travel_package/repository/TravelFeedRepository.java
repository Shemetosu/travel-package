package com.itstep.travel_package.repository;

import com.itstep.travel_package.model.entity.TravelFeed;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface TravelFeedRepository extends JpaRepository<TravelFeed, Integer>, JpaSpecificationExecutor<TravelFeed> {
}
