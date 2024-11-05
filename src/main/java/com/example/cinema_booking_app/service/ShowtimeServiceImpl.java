package com.example.cinema_booking_app.service;

import com.example.cinema_booking_app.model.Showtime;
import com.example.cinema_booking_app.repository.ShowtimeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ShowtimeServiceImpl implements ShowtimeService {

    private final ShowtimeRepository showtimeRepository;

    @Autowired
    public ShowtimeServiceImpl(ShowtimeRepository showtimeRepository) {
        this.showtimeRepository = showtimeRepository;
    }

    @Override
    public List<Showtime> getAllShowtimes() {
        return showtimeRepository.findAll();
    }

    @Override
    public Optional<Showtime> getShowtimeById(Long id) {
        return showtimeRepository.findById(id);
    }

    @Override
    public Showtime addShowtime(Showtime showtime) {
        return showtimeRepository.save(showtime);
    }

    @Override
    public Optional<Showtime> updateShowtime(Long id, Showtime showtimeDetails) {
        return showtimeRepository.findById(id).map(showtime -> {
            showtime.setMovie(showtimeDetails.getMovie());
            showtime.setDateTime(showtimeDetails.getDateTime()); // Ensure this method exists
            showtime.setScreen(showtimeDetails.getScreen());
            return showtimeRepository.save(showtime);
        });
    }


    @Override
    public boolean deleteShowtime(Long id) {
        if (showtimeRepository.existsById(id)) {
            showtimeRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
