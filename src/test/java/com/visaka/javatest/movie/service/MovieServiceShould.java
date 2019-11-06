package com.visaka.javatest.movie.service;

import com.visaka.javatest.movie.data.MovieRepository;
import com.visaka.javatest.movie.model.Genre;
import com.visaka.javatest.movie.model.Movie;
import org.hamcrest.CoreMatchers;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import static com.visaka.javatest.movie.model.Genre.*;
import static org.junit.Assert.*;

public class MovieServiceShould {


    public  MovieService movieService;

    @Before
    public void setUp() throws Exception {
        MovieRepository movieRepository = Mockito.mock(MovieRepository.class);
        Mockito.when(movieRepository.findAll()).thenReturn(
                Arrays.asList(
                        new Movie(1, "Dark Knight", 152, ACTION),
                        new Movie(2, "Memento", 113, THRILLER),
                        new Movie(3, "There's Something About Mary", 119, COMEDY),
                        new Movie(4, "Super 8", 112, THRILLER),
                        new Movie(5, "Scream", 111, HORROR),
                        new Movie(6, "Home Alone", 103, COMEDY),
                        new Movie(7, "Matrix", 136, ACTION)
                )
        );

        movieService = new MovieService(movieRepository);
    }

    @Test
    public  void return_movies_by_genre() {


//      Collecion de peliculas
        Collection<Movie>  movies = movieService.findMoviesByGenre(Genre.COMEDY);
//      Lista de ids
        //        test
        assertThat(getMovieIds(movies), CoreMatchers.is(Arrays.asList(3,6)));
    }

    @Test
    public void return_movies_by_length() {
        Collection<Movie> movies = movieService.findMoviesByLength(119);

        assertThat(getMovieIds(movies), CoreMatchers.is(Arrays.asList(2,3,4,5,6)));
    }

    private List<Integer> getMovieIds(Collection<Movie> movies) {
        return movies.stream().map(Movie::getId).collect(Collectors.toList());
    }

}