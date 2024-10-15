package com.devaar.booking_append.dao.repository;

import com.devaar.booking_append.dao.entity.BookingEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<BookingEntity,Long> {
}
