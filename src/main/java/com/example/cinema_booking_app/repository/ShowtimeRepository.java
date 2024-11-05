package com.example.cinema_booking_app.repository;

import com.example.cinema_booking_app.model.Showtime;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShowtimeRepository extends JpaRepository<Showtime, Long> {
    // Custom query methods can be defined here if needed
}
