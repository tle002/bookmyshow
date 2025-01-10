package com.bookmyshow.service;

import com.bookmyshow.model.Booking;
import com.bookmyshow.model.Show;
import com.bookmyshow.repository.BookingRepository;
import com.bookmyshow.repository.ShowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.List;

@Service
public class BookingService {

    @Autowired
    private BookingRepository bookingRepository;

    @Autowired
    private ShowRepository showRepository;

    public Booking bookSeat(Booking booking) {
        // Check if the show exists
        Optional<Show> showOptional = showRepository.findById(booking.getShowId());
        if (!showOptional.isPresent()) {
            throw new RuntimeException("Show not found");
        }

        Show show = showOptional.get();

        // Check if there are available seats
        if (show.getAvailableSeats() <= 0) {
            throw new RuntimeException("No available seats for this show");
        }

        // Decrease the available seats
        show.setAvailableSeats(show.getAvailableSeats() - 1);
        showRepository.save(show);

        // Save the booking
        return bookingRepository.save(booking);
    }

    public void clearSeat(Long bookingId) {
        // Find the booking
        Optional<Booking> bookingOptional = bookingRepository.findById(bookingId);
        if (!bookingOptional.isPresent()) {
            throw new RuntimeException("Booking not found");
        }

        Booking booking = bookingOptional.get();

        // Check if the payment is not made
        if (!booking.isPaymentStatus()) {
            // Increase the available seats
            Optional<Show> showOptional = showRepository.findById(booking.getShowId());
            if (showOptional.isPresent()) {
                Show show = showOptional.get();
                show.setAvailableSeats(show.getAvailableSeats() + 1);
                showRepository.save(show);
            }

            // Delete the booking
            bookingRepository.delete(booking);
        }
    }
    public List<Booking> getAllBookings() {
        // Retrieve all bookings from the database
        return bookingRepository.findAll();
    }
}