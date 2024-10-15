package com.devaar.booking_append.service.abstracts;

import com.devaar.booking_append.model.dtos.request.PassengerRequest;
import com.devaar.booking_append.model.dtos.response.PassengerResponse;

import java.util.List;

public interface IPassengerService {

    List<PassengerResponse> getAllPassengers();
    PassengerResponse getPassengerById(Long id);
}
