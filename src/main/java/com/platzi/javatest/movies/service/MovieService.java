package com.platzi.javatest.movies.service;

import com.platzi.javatest.movies.data.MovieRepositor;
import com.platzi.javatest.movies.model.Genre;
import com.platzi.javatest.movies.model.Movie;

import java.util.Collection;

public class MovieService {

    private MovieRepositor movieRepositor;

    public MovieService(MovieRepositor movieRepositor){
        this.movieRepositor = movieRepositor;
    }

    public Collection<Movie> findMoviesByGenre(Genre genre) {

        Collection<Movie> allMovies = movieRepositor.findAll();

       return allMovies;
    }
}
