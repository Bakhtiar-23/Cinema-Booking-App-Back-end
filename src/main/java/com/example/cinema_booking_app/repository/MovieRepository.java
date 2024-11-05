package com.example.cinema_booking_app.repository;

import com.example.cinema_booking_app.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {
    // You can define custom query methods here if needed
}
