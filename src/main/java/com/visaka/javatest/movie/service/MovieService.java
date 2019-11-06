package com.visaka.javatest.movie.service;

import com.visaka.javatest.movie.data.MovieRepository;
import com.visaka.javatest.movie.model.Genre;
import com.visaka.javatest.movie.model.Movie;

import java.util.Collection;
import java.util.stream.Collectors;

public class MovieService {

    private MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public Collection<Movie> findMoviesByGenre(Genre genre ) {

//        Collection<Movie>  allMovies = movieRepository.findAll().stream()
//                .filter(movie -> movie.getGenre() == genre).collect(Collectors.toList());
//        return  allMovies;
        return movieRepository.findAll().stream()
                .filter(movie -> movie.getGenre() == genre).collect(Collectors.toList());
    }
}
