package com.platzi.javatest.movies.service;

import com.platzi.javatest.movies.data.MovieRepositor;
import com.platzi.javatest.movies.model.Genre;

public class MovieService {

    private MovieRepositor movieRepositor;

    public MovieService(MovieRepositor movieRepositor){

        this.movieRepositor = movieRepositor;
    }

    public void findMoviesByGenre(Genre genre) {

    }
}
