package com.itstep.travel_package.repository;

import com.itstep.travel_package.model.entity.TravelType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface TravelTypeRepository extends JpaRepository<TravelType, Integer>, JpaSpecificationExecutor<TravelType> {
}
