package com.devaar.booking_append.dao.repository;

import com.devaar.booking_append.dao.entity.PassengerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassengerRepository extends JpaRepository<PassengerEntity,Long> {
}
