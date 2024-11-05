package com.example.cinema_booking_app.controller;

import com.example.cinema_booking_app.model.Seat;
import com.example.cinema_booking_app.repository.SeatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/seats")
public class SeatController {

    @Autowired
    private SeatRepository seatRepository;

    @GetMapping
    public List<Seat> getAllSeats() {
        return seatRepository.findAll();
    }

    @PostMapping
    public Seat createSeat(@RequestBody Seat seat) {
        return seatRepository.save(seat);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Seat> updateSeat(@PathVariable Long id, @RequestBody Seat seatDetails) {
        Seat seat = seatRepository.findById(id).orElseThrow();
        seat.setBooked(seatDetails.isBooked());
        return ResponseEntity.ok(seatRepository.save(seat));
    }
    @GetMapping("/")
    public String home() {
        return "Welcome to the Cinema Booking App! Try /movies to see available movies.";
    }
}
