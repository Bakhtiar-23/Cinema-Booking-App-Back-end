package com.example.cinema_booking_app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CinemaController {

    @GetMapping("/")
    public String showCinema() {
        return "Welcome to the Cinema Booking App!";
    }
}
