package com.itstep.travelpackage.repository;

import com.itstep.travelpackage.model.entity.TravelTransport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface TravelTransportRepository extends JpaRepository<TravelTransport, Long>, JpaSpecificationExecutor<TravelTransport> {
}
