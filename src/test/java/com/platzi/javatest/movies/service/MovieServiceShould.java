package com.platzi.javatest.movies.service;

import com.platzi.javatest.movies.data.MovieRepositor;
import com.platzi.javatest.movies.model.Genre;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class MovieServiceShould {

    @Test
    public void return_movies_by_genre(){

        MovieRepositor movieRepositor = Mockito.mock(MovieRepositor.class);

        

        MovieService movieService = new MovieService(movieRepositor);

       movieService.findMoviesByGenre(Genre.Comedy);
    }
}