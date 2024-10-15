package com.devaar.booking_append.model.dtos.request;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PassengerRequest {
    private Long id;
    private String fullName;
//    private List<BookingRequest> bookings;
}
