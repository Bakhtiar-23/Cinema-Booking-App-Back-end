package com.example.cinema_booking_app.controller;

import com.example.cinema_booking_app.model.Ticket;
import com.example.cinema_booking_app.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tickets")
public class TicketController {

    @Autowired
    private TicketRepository ticketRepository;

    @GetMapping
    public List<Ticket> getAllTickets() {
        return ticketRepository.findAll();
    }

    @PostMapping
    public Ticket createTicket(@RequestBody Ticket ticket) {
        return ticketRepository.save(ticket);
    }
    @GetMapping("/welcome")
    public String home() {
        return "Welcome to the Cinema Booking App! Try /movies to see available movies.";
    }
}
