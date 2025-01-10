package com.bookmyshow.service;
import com.bookmyshow.model.Booking;
import com.bookmyshow.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BookingService {

    @Autowired
    private BookingRepository bookingRepository;

    public Booking bookSeat(Booking booking) {
        // Logic to book a seat
        return bookingRepository.save(booking);
    }

    public void clearSeat(Long bookingId) {
        // Logic to clear a seat without payment
        Optional<Booking> booking = bookingRepository.findById(bookingId);
        booking.ifPresent(bookingRepository::delete);
    }
}