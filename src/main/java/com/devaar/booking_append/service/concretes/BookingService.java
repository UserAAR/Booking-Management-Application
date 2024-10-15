package com.devaar.booking_append.service.concretes;

import com.devaar.booking_append.dao.entity.BookingEntity;
import com.devaar.booking_append.dao.repository.BookingRepository;
import com.devaar.booking_append.exceptions.EntityNotFoundException;
import com.devaar.booking_append.model.dtos.request.BookingRequest;
import com.devaar.booking_append.model.dtos.response.BookingResponse;
import com.devaar.booking_append.service.abstracts.IBookingService;
import com.devaar.booking_append.utils.mapper.BookingMapper;
import com.devaar.booking_append.utils.mapper.FlightMapper;
import com.devaar.booking_append.utils.mapper.PassengerMapper;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@Slf4j
public class BookingService implements IBookingService {
    private final FlightMapper flightMapper ;
    private final PassengerMapper passengerMapper;
    private BookingRepository bookingRepository;
    private final BookingMapper bookingMapper;

    @Override
    public BookingResponse createBooking(BookingRequest bookingRequest) {
        var bookingEntity = bookingMapper.toEntity(bookingRequest);
        var saved = bookingRepository.save(bookingEntity);
        return bookingMapper.toResponse(saved);
    }

    @Override
    public List<BookingResponse> getAllBookings() {
        var bookingEntities = bookingRepository.findAll();
        return bookingMapper.toResponseList(bookingEntities);
    }

    @Override
    public BookingResponse updateBooking(Long id, BookingRequest bookingRequest) {
        var bookingEntity = bookingRepository.findById(id)
                .orElseThrow(EntityNotFoundException::new);

        var updatedBooking = BookingEntity.builder()
                .id(bookingEntity.getId())
                .bookingDateTime(bookingRequest.getBookingDateTime() != null ? bookingRequest.getBookingDateTime() : bookingEntity.getBookingDateTime())
                .flight(bookingRequest.getFlight() != null ? flightMapper.toEntity(bookingRequest.getFlight()) : bookingEntity.getFlight())
                .passengers(bookingRequest.getPassengers() != null ? passengerMapper.toEntityList(bookingRequest.getPassengers()) : bookingEntity.getPassengers())
                .build();

        BookingEntity saved = bookingRepository.save(updatedBooking);

        return bookingMapper.toResponse(saved);
    }

    @Override
    public void deleteById(Long id) {
        bookingRepository.deleteById(id);
    }

    @Override
    public BookingResponse findById(Long id) {
        var entity = bookingRepository.findById(id).orElseThrow(EntityNotFoundException::new);
        return bookingMapper.toResponse(entity);
    }
}
