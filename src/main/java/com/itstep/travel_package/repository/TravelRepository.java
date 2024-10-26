package com.itstep.travel_package.repository;

import com.itstep.travel_package.model.entity.Travel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface TravelRepository extends JpaRepository<Travel, Integer>, JpaSpecificationExecutor<Travel> {
}
