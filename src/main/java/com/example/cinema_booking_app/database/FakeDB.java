package com.example.cinema_booking_app.database;

import com.example.cinema_booking_app.model.Booking;
import com.example.cinema_booking_app.model.Customer;
import com.example.cinema_booking_app.model.Movie;
import com.example.cinema_booking_app.model.Showtime;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FakeDB {
    
    private static final List<Movie> movies = new ArrayList<>();
    private static final List<Customer> customers = new ArrayList<>();
    private static final List<Showtime> showtimes = new ArrayList<>();
    private static final List<Booking> bookings = new ArrayList<>();

    static {
        // Initialize movies
        movies.add(new Movie(1L, "Inception", "Sci-Fi", 148));
        movies.add(new Movie(2L, "The Godfather", "Crime", 175));
        movies.add(new Movie(3L, "Pulp Fiction", "Drama", 154));
        movies.add(new Movie(4L, "The Dark Knight", "Action", 152));
        movies.add(new Movie(5L, "Interstellar", "Sci-Fi", 169));

        // Initialize customers
        customers.add(new Customer(1L, "John Doe", "john@example.com"));
        customers.add(new Customer(2L, "Jane Smith", "jane@example.com"));

     // Initialize showtimes
        showtimes.add(new Showtime(1L, movies.get(0), new Date(), "Screen 1"));
        showtimes.add(new Showtime(2L, movies.get(1), new Date(), "Screen 2"));


        // Initialize bookings
        bookings.add(new Booking(1L, customers.get(0), showtimes.get(0), 2, new Date()));
        bookings.add(new Booking(2L, customers.get(1), showtimes.get(1), 1, new Date()));
    }

    public static List<Movie> getMovies() {
        return movies;
    }

    public static List<Customer> getCustomers() {
        return customers;
    }

    public static List<Showtime> getShowtimes() {
        return showtimes;
    }

    public static List<Booking> getBookings() {
        return bookings;
    }
}
