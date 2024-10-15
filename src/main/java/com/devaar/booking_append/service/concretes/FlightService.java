package com.devaar.booking_append.service.concretes;


import com.devaar.booking_append.dao.entity.FlightEntity;
import com.devaar.booking_append.dao.repository.FlightRepository;
import com.devaar.booking_append.exceptions.EntityNotFoundException;
import com.devaar.booking_append.model.dtos.request.FlightRequest;
import com.devaar.booking_append.model.dtos.response.FlightResponse;
import com.devaar.booking_append.service.abstracts.IFlightService;
import com.devaar.booking_append.utils.mapper.FlightMapper;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@Slf4j
public class FlightService implements IFlightService {
    private FlightRepository flightRepository;
    private FlightMapper flightMapper;


    @Override
    public FlightResponse createFlight(FlightRequest flightRequest) {
        var flightEntity = flightMapper.toEntity(flightRequest);
        flightRepository.save(flightEntity);
        return flightMapper.toResponse(flightEntity);
    }

    @Override
    public FlightResponse updateFlight(Long id, FlightRequest flightRequest) {
        var flightEntity = flightRepository.findById(id).
                orElseThrow(() -> new EntityNotFoundException());

        var updatedEntity = FlightEntity.builder()
                .id(Long.valueOf(id))
                .origin(flightRequest.getOrigin()!=null?flightRequest.getOrigin():flightRequest.getOrigin())
                .destination(flightRequest.getDestination()!=null?flightRequest.getDestination():flightRequest.getDestination())
                .departureTime(flightEntity.getDepartureTime()!=null?flightRequest.getDepartureTime():flightEntity.getDepartureTime())
                .freeSeats(flightEntity.getFreeSeats()!=null?flightRequest.getFreeSeats():flightEntity.getFreeSeats())
                        .build();
        var savedEntity = flightRepository.save(updatedEntity);

        return flightMapper.toResponse(savedEntity);
    }

    @Override
    public void deleteFlight(FlightRequest flightRequest) {
        var id = flightRequest.getId();
        flightRepository.deleteById(id);
    }

    @Override
    public void deleteFlightyId(Long id) {
        flightRepository.deleteById(id);
    }

    @Override
    public FlightResponse getBookingById(Long id) {
        var entity = flightRepository.findById(id).orElseThrow(() -> new EntityNotFoundException());
        return flightMapper.toResponse(entity);
    }

    @Override
    public List<FlightResponse> getAllBookings() {
    var entities = flightRepository.findAll();
    var responses = entities.stream().map(flightMapper::toResponse);
    return responses.toList();
    }
}
