package com.platzi.javatest.movies.data;

import com.platzi.javatest.movies.model.Movie;

import java.util.Collection;


public interface MovieRepositor {

    Movie findById(long id);
    Collection<Movie> findAll();
    void saveOrUpdate(Movie movie);
}
