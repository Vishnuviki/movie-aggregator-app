package com.aggregator.movie.movieaggregatorapp.service;

import com.aggregator.movie.movieaggregatorapp.connector.MovieDetailsConnector;
import com.aggregator.movie.movieaggregatorapp.connector.MovieRatingConnector;
import com.aggregator.movie.movieaggregatorapp.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class MovieServiceImpl implements MovieService {
    @Autowired
    private MovieDetailsConnector movieDetailsConnector;

    @Autowired
    private MovieRatingConnector movieRatingConnector;

    @Override
    public MovieList getAllMovies() {
        MovieDetailList movieDetailList = movieDetailsConnector.doConnect();
        MovieList movieList = new MovieList();
        movieList.getMovieList()
                .addAll(getAllMovies(movieDetailList));
        return movieList;
    }

    private List<Movie> getAllMovies(MovieDetailList movieDetailList) {
        return movieDetailList.getMovieList()
                .stream()
                .map(this::getRatingByMovieId)
                .collect(Collectors.toList());
    }

    private Movie getRatingByMovieId(MovieDetail movieDetail) {
        Long movieId = movieDetail.getMovieId();
        MovieRating movieRating = movieRatingConnector.doConnect(movieId);
        return buildMovie(movieDetail, movieRating);
    }

    private Movie buildMovie(MovieDetail movieDetail, MovieRating movieRating) {
        Movie movie = new Movie();
        movie.setMovieId(movieDetail.getMovieId());
        movie.setMovieName(movieDetail.getMovieName());
        movie.setDescription(movieDetail.getDescription());
        movie.setRating(movieRating.getRating());
        return movie;
    }
}
