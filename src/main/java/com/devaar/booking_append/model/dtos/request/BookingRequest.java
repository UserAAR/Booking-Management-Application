package com.devaar.booking_append.model.dtos.request;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class BookingRequest {
    private Long id;
    private java.sql.Timestamp bookingDateTime;
    private FlightRequest flight;
    private List<PassengerRequest> passengers;
}
