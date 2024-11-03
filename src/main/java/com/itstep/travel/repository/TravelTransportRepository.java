package com.itstep.travel.repository;

import com.itstep.travel.model.entity.TravelTransport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TravelTransportRepository extends JpaRepository<TravelTransport, Long> {
}
