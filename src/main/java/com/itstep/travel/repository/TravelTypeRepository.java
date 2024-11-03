package com.itstep.travel.repository;

import com.itstep.travel.model.entity.TravelType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TravelTypeRepository extends JpaRepository<TravelType, Long> {
}
