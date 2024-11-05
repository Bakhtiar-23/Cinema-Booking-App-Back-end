package com.example.cinema_booking_app.service;

import com.example.cinema_booking_app.model.Movie;
import java.util.List;
import java.util.Optional;

public interface MovieService {
    List<Movie> getAllMovies();
    Optional<Movie> getMovieById(Long id);
    Movie addMovie(Movie movie);
    Optional<Movie> updateMovie(Long id, Movie movieDetails);
    boolean deleteMovie(Long id);
}
