package com.aggregator.movie.movieaggregatorapp.controller;

import com.aggregator.movie.movieaggregatorapp.connector.MovieRatingConnector;
import com.aggregator.movie.movieaggregatorapp.model.MovieList;
import com.aggregator.movie.movieaggregatorapp.model.MovieRating;
import com.aggregator.movie.movieaggregatorapp.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @Autowired
    private MovieService movieService;

    @RequestMapping(value = "/movies",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<MovieList> getMovies() {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(movieService.getAllMovies());
    }
}
