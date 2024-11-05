package com.example.cinema_booking_app.repository;

import com.example.cinema_booking_app.model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket, Long> {
}
