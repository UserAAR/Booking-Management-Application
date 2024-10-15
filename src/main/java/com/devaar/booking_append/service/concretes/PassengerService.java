package com.devaar.booking_append.service.concretes;

import com.devaar.booking_append.dao.repository.PassengerRepository;
import com.devaar.booking_append.model.dtos.response.PassengerResponse;
import com.devaar.booking_append.service.abstracts.IPassengerService;
import com.devaar.booking_append.utils.mapper.PassengerMapper;

import java.util.List;


public class PassengerService implements IPassengerService {
    private PassengerRepository passengerRepository;
    private PassengerMapper passengerMapper;


    @Override
    public List<PassengerResponse> getAllPassengers() {
        return List.of();
    }

    @Override
    public PassengerResponse getPassengerById(Long id) {
        return null;
    }
}
