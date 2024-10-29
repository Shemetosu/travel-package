package com.itstep.travelpackage.repository;

import com.itstep.travelpackage.model.entity.TravelType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface TravelTypeRepository extends JpaRepository<TravelType, Integer>, JpaSpecificationExecutor<TravelType> {
}
