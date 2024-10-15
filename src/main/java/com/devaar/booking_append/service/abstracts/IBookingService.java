package com.devaar.booking_append.service.abstracts;

import com.devaar.booking_append.model.dtos.request.BookingRequest;
import com.devaar.booking_append.model.dtos.response.BookingResponse;

import java.util.List;

public interface IBookingService {
    BookingResponse createBooking(BookingRequest bookingRequest);
    List<BookingResponse> getAllBookings();
    BookingResponse updateBooking(Long id,BookingRequest bookingRequest);
    void deleteById(Long id);
    BookingResponse findById(Long id);



}
