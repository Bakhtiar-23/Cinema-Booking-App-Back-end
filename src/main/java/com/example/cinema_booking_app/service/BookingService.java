package com.example.cinema_booking_app.service;

import com.example.cinema_booking_app.model.Booking;
import java.util.List;
import java.util.Optional;

public interface BookingService {
    List<Booking> getAllBookings();
    Optional<Booking> getBookingById(Long id);
    Booking addBooking(Booking booking);
    Optional<Booking> updateBooking(Long id, Booking bookingDetails);
    boolean deleteBooking(Long id);
}
