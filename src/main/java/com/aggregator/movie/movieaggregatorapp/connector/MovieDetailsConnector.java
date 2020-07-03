package com.aggregator.movie.movieaggregatorapp.connector;

import com.aggregator.movie.movieaggregatorapp.model.MovieDetailList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class MovieDetailsConnector {
    private final String url = "http://movie-details-app/allMovies";

    @Autowired
    private RestTemplate restTemplate;

    public MovieDetailList doConnect() {
        ResponseEntity<MovieDetailList> res = restTemplate.getForEntity(url, MovieDetailList.class);
        return res.getBody();
    }
}
