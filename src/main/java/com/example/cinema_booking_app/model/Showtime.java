package com.example.cinema_booking_app.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Showtime")
public class Showtime {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long showtimeId;

    @ManyToOne
    @JoinColumn(name = "movie_id", nullable = false)
    private Movie movie;

    @Column(nullable = false)
    private Date dateTime;

    private String screen;
    
    // Constructors
    public Showtime() {}

    public Showtime(Long showtimeId, Movie movie, Date dateTime, String screen) {
        this.showtimeId = showtimeId;
        this.movie = movie;
        this.dateTime = dateTime;
        this.screen = screen;
    }

    // Getters and Setters
    public Long getShowtimeId() {
        return showtimeId;
    }

    public void setShowtimeId(Long showtimeId) {
        this.showtimeId = showtimeId;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    public String getScreen() {
        return screen;
    }

    public void setScreen(String screen) {
        this.screen = screen;
    }
}
