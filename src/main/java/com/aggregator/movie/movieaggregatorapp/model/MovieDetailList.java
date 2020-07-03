package com.aggregator.movie.movieaggregatorapp.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MovieDetailList {
    private List<MovieDetail> movieList;

    public List<MovieDetail> getMovieList() {
        if (Objects.isNull(movieList)) {
            movieList = new ArrayList<>();
            return movieList;
        } else {
            return movieList;
        }
    }
}
