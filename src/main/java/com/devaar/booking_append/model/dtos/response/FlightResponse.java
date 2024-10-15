package com.devaar.booking_append.model.dtos.response;


import com.devaar.booking_append.model.enums.City;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FlightResponse {
    private Long id;

    private City origin;
    private City destination;
    private LocalDateTime departureTime;
    private Integer freeSeats;
//    private List<BookingResponse> bookings;
}
