package com.platzi.javatest.movies.service;

import com.platzi.javatest.movies.data.MovieRepositor;
import com.platzi.javatest.movies.model.Genre;
import com.platzi.javatest.movies.model.Movie;
import org.hamcrest.CoreMatchers;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

public class MovieServiceShould {

    @Test
    public void return_movies_by_genre(){

        MovieRepositor movieRepositor = Mockito.mock(MovieRepositor.class);

        Mockito.when(movieRepositor.findAll()).thenReturn(
                Arrays.asList(
                        new Movie(1, "Godzilla vs kong", 180, Genre.Action),
                        new Movie(2, "un lugar en silencio", 150, Genre.Thriller),
                        new Movie(3, "Donde estan las rubias", 120, Genre.Comedy),
                        new Movie(4, "Avengers end game", 210, Genre.Action),
                        new Movie(5, "El resplandor", 160, Genre.Horror),
                        new Movie(6, "Guerra de papas", 180, Genre.Comedy),
                        new Movie(7, "Familia al instante", 180, Genre.Drama)
                )
        );

        MovieService movieService = new MovieService(movieRepositor);

        Collection<Movie> movies = movieService.findMoviesByGenre(Genre.Comedy);

        List<Integer> movieIds =movies.stream().map(movie -> movie.getId()).collect(Collectors.toList());

        assertThat( movieIds, CoreMatchers.is(Arrays.asList(3, 6)));
    }
}