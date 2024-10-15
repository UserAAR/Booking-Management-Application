package com.devaar.booking_append.controller;

import com.devaar.booking_append.model.dtos.request.BookingRequest;
import com.devaar.booking_append.model.dtos.response.BookingResponse;
import com.devaar.booking_append.service.abstracts.IBookingService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/booking")
public class BookingController {

    private final IBookingService bookingService;

    @PostMapping("/save")
    public BookingResponse saveBooking(@RequestBody BookingRequest bookingRequest) {
        return bookingService.createBooking(bookingRequest);
    }

    @GetMapping("/all-bookings")
    public List<BookingResponse> getAllBookings() {
        return bookingService.getAllBookings();
    }

    @PatchMapping("/update/{id}")
    BookingResponse updateBooking(@PathVariable Long id, @RequestBody BookingRequest bookingRequest) {
        return bookingService.updateBooking(id, bookingRequest);
    }

    @DeleteMapping("/delete/{id}")
    void deleteById(@PathVariable Long id) {
        bookingService.deleteById(id);
    }

    @GetMapping("/{id}")
    BookingResponse getBookingById(@PathVariable Long id) {
        return bookingService.findById(id);
    }


}
