package com.aggregator.movie.movieaggregatorapp.model;

public class MovieDetail {
    private Long movieId;
    private String movieName;
    private String description;

    public MovieDetail() {}

    public MovieDetail(Long movieId, String movieName, String description) {
        super();
        this.movieId = movieId;
        this.movieName = movieName;
        this.description = description;
    }

    public Long getMovieId() {
        return movieId;
    }

    public void setMovieId(Long movieId) {
        this.movieId = movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
