package com.example.cinema_booking_app.service;

import com.example.cinema_booking_app.database.FakeDB;
import com.example.cinema_booking_app.model.Movie;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieServiceImpl implements MovieService {

    @Override
    public List<Movie> getAllMovies() {
        return FakeDB.getMovies();
    }

    @Override
    public Optional<Movie> getMovieById(Long id) {
        return FakeDB.getMovies().stream()
                .filter(movie -> movie.getMovieId().equals(id))
                .findFirst();
    }

    @Override
    public Movie addMovie(Movie movie) {
        FakeDB.getMovies().add(movie);
        return movie; // Return the added movie
    }

    @Override
    public Optional<Movie> updateMovie(Long id, Movie movieDetails) {
        return FakeDB.getMovies().stream()
                .filter(movie -> movie.getMovieId().equals(id))
                .findFirst()
                .map(movie -> {
                    movie.setTitle(movieDetails.getTitle());
                    movie.setGenre(movieDetails.getGenre());
                    movie.setDuration(movieDetails.getDuration());
                    return movie;
                });
    }

    @Override
    public boolean deleteMovie(Long id) {
        return FakeDB.getMovies().removeIf(movie -> movie.getMovieId() != null && movie.getMovieId().equals(id));
    }
}
