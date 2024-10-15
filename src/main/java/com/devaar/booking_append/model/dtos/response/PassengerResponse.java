package com.devaar.booking_append.model.dtos.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PassengerResponse {
    private Long id;
    private String fullName;
//    private List<BookingResponse> bookings;
}
