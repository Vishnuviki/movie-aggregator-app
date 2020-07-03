package com.aggregator.movie.movieaggregatorapp.model;

public class MovieRating {
    private Long movieId;
    private Long rating;

    public MovieRating() {}

    public MovieRating(Long movieId, Long rating) {
        this.movieId = movieId;
        this.rating = rating;
    }

    public Long getMovieId() {
        return movieId;
    }

    public void setMovieId(Long movieId) {
        this.movieId = movieId;
    }

    public Long getRating() {
        return rating;
    }

    public void setRating(Long rating) {
        this.rating = rating;
    }
}