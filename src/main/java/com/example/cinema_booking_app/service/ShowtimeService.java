package com.example.cinema_booking_app.service;

import com.example.cinema_booking_app.model.Showtime;

import java.util.List;
import java.util.Optional;

public interface ShowtimeService {
    List<Showtime> getAllShowtimes();
    Optional<Showtime> getShowtimeById(Long id);
    Showtime addShowtime(Showtime showtime);
    Optional<Showtime> updateShowtime(Long id, Showtime showtimeDetails);
    boolean deleteShowtime(Long id);
}
