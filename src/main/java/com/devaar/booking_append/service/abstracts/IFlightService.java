package com.devaar.booking_append.service.abstracts;

import com.devaar.booking_append.model.dtos.request.FlightRequest;
import com.devaar.booking_append.model.dtos.response.FlightResponse;

import java.util.List;

public interface IFlightService {
    FlightResponse createFlight(FlightRequest flightRequest);
    FlightResponse updateFlight(Long id, FlightRequest flightRequest);
    void deleteFlight(FlightRequest flightRequest);
    void deleteFlightyId(Long id);
    FlightResponse getBookingById(Long id);
    List<FlightResponse> getAllBookings();
}
