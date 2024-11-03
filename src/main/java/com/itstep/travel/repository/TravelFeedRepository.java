package com.itstep.travel.repository;

import com.itstep.travel.model.entity.TravelFeed;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TravelFeedRepository extends JpaRepository<TravelFeed, Long> {
}
