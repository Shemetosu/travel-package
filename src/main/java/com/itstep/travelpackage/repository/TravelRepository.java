package com.itstep.travelpackage.repository;

import com.itstep.travelpackage.model.entity.Travel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface TravelRepository extends JpaRepository<Travel, Long>, JpaSpecificationExecutor<Travel> {
}
