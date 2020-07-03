package com.aggregator.movie.movieaggregatorapp.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MovieList {
    private List<Movie> movieList;

    public List<Movie> getMovieList() {
        if (Objects.isNull(movieList)) {
            movieList = new ArrayList<>();
            return movieList;
        } else {
            return movieList;
        }
    }
}
