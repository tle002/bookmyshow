package com.bookmyshow.controller;

import com.bookmyshow.model.Booking;
import com.bookmyshow.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bookings")
public class BookingController {

    @Autowired
    private BookingService bookingService;

    @PostMapping("/book")
    public ResponseEntity<Booking> bookSeat(@RequestBody Booking booking) {
        Booking createdBooking = bookingService.bookSeat(booking);
        return ResponseEntity.ok(createdBooking);
    }

    @DeleteMapping("/clear/{bookingId}")
    public ResponseEntity<String> clearSeat(@PathVariable Long bookingId) {
        bookingService.clearSeat(bookingId);
        return ResponseEntity.ok("Booking cleared successfully");
    }

    @GetMapping
    public ResponseEntity<List<Booking>> getAllBookings() {
        List<Booking> bookings = bookingService.getAllBookings();
        return ResponseEntity.ok(bookings);
    }
}