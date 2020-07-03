package com.aggregator.movie.movieaggregatorapp.connector;

import com.aggregator.movie.movieaggregatorapp.model.MovieRating;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class MovieRatingConnector {
    private final String url = "http://movie-rating-app/getRating/";

    @Autowired
    private RestTemplate restTemplate;

    public MovieRating doConnect(Long movieId) {
        ResponseEntity<MovieRating> movieRating = restTemplate.getForEntity(
                url + "" + movieId, MovieRating.class);
        return movieRating.getBody();
    }
}
