package com.devaar.booking_append.model.dtos.response;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class BookingResponse {
    private Long id;
    private Timestamp bookingDateTime;
    private FlightResponse flight;
    private List<PassengerResponse> passengers;
}

