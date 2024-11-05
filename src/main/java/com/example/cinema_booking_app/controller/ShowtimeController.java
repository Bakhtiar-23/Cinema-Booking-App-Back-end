package com.example.cinema_booking_app.controller;

import com.example.cinema_booking_app.database.FakeDB;
import com.example.cinema_booking_app.model.Showtime;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/showtimes")
public class ShowtimeController {

    @GetMapping("/{id}")
    public ResponseEntity<Showtime> getShowtimeById(@PathVariable Long id) {
        List<Showtime> showtimes = FakeDB.getShowtimes();
        Optional<Showtime> showtime = showtimes.stream()
                .filter(s -> s.getShowtimeId().equals(id))
                .findFirst();

        return showtime.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping
    public List<Showtime> getAllShowtimes() {
        return FakeDB.getShowtimes();
    }

    @PostMapping
    public ResponseEntity<Showtime> createShowtime(@RequestBody Showtime newShowtime) {
        // Simulate adding the new showtime to the FakeDB
        FakeDB.getShowtimes().add(newShowtime); // Ensure to handle ID management appropriately
        return ResponseEntity.status(201).body(newShowtime); // Return 201 Created
    }

    @PutMapping("/{id}")
    public ResponseEntity<Showtime> updateShowtime(@PathVariable Long id, @RequestBody Showtime updatedShowtime) {
        List<Showtime> showtimes = FakeDB.getShowtimes();
        Optional<Showtime> existingShowtime = showtimes.stream()
                .filter(s -> s.getShowtimeId().equals(id))
                .findFirst();

        if (existingShowtime.isPresent()) {
            Showtime showtimeToUpdate = existingShowtime.get();
            showtimeToUpdate.setMovie(updatedShowtime.getMovie());
            showtimeToUpdate.setDateTime(updatedShowtime.getDateTime());
            showtimeToUpdate.setScreen(updatedShowtime.getScreen());
            return ResponseEntity.ok(showtimeToUpdate);
        }

        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteShowtime(@PathVariable Long id) {
        List<Showtime> showtimes = FakeDB.getShowtimes();
        boolean removed = showtimes.removeIf(s -> s.getShowtimeId().equals(id));

        if (removed) {
            return ResponseEntity.noContent().build(); // 204 No Content
        }

        return ResponseEntity.notFound().build(); // 404 Not Found
    }
}
