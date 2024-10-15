package com.devaar.booking_append.controller;

import com.devaar.booking_append.model.dtos.request.FlightRequest;
import com.devaar.booking_append.model.dtos.response.FlightResponse;
import com.devaar.booking_append.service.concretes.FlightService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/flight")
public class FlightController {
//    FlightResponse createFlight(FlightRequest flightRequest);
//    FlightResponse updateFlight(Long id, FlightRequest flightRequest);
//    void deleteFlight(FlightRequest flightRequest);
//    void deleteFlightyId(Long id);
//    FlightResponse getBookingById(Long id);
//

    private final FlightService flightService;

    @GetMapping("/all")
    public List<FlightResponse> getAllFlights() {
        return flightService.getAllBookings();
    }

    @DeleteMapping("/delete")
    public void deleteFlight(@RequestBody FlightRequest flightRequest) {
        flightService.deleteFlight(flightRequest);
    }

}
