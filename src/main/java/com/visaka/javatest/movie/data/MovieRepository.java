package com.visaka.javatest.movie.data;

import com.visaka.javatest.movie.model.Movie;

import java.util.Collection;

public interface MovieRepository {
    Collection<Movie> findAll();


//    Movie findById(long id);
//
//    Collection<Movie> findAll();
//
//    voidsaveOrUpdate(Movie movie);
}
