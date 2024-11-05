package com.example.cinema_booking_app.repository;

import com.example.cinema_booking_app.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository; // Ensure this import is present

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long> {
}
