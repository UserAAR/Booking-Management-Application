package com.devaar.booking_append.dao.repository;

import com.devaar.booking_append.dao.entity.FlightEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightRepository extends JpaRepository<FlightEntity,Long> {
}
