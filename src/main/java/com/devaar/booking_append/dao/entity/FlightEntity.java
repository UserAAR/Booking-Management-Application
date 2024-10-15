package com.devaar.booking_append.dao.entity;

import com.devaar.booking_append.model.enums.City;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "flights")
public class FlightEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    @Enumerated(EnumType.STRING)
    private City origin;

    @Column
    @Enumerated(EnumType.STRING)
    private City destination;

    @Column(name = "departure_time")
    private LocalDateTime departureTime;

    @Column(name = "free_seats")
    private Integer freeSeats;

//    @OneToMany(mappedBy = "flight")
//    private List<BookingEntity> bookings;



}
