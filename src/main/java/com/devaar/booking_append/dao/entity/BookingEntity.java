package com.devaar.booking_append.dao.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "bookings")
public class BookingEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "flight_id")
    private FlightEntity flight;

    @Column(name = "booking_date_time")
    private java.sql.Timestamp bookingDateTime;

    @ManyToMany
    @JoinTable(
            name = "bookings_passengers",
            joinColumns = @JoinColumn(name = "booking_id"),
            inverseJoinColumns = @JoinColumn(name = "passenger_id")
    )
    private List<PassengerEntity> passengers;
}
