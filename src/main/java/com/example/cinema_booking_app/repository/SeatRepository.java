package com.example.cinema_booking_app.repository;

import com.example.cinema_booking_app.model.Seat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeatRepository extends JpaRepository<Seat, Long> {
}
