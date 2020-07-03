package com.aggregator.movie.movieaggregatorapp.controller;

import com.aggregator.movie.movieaggregatorapp.model.ErrorMessage;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieAggErrorController implements ErrorController {

    @RequestMapping(value = "/error",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ErrorMessage> getErrorMessage() {
        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(new ErrorMessage(
                        "500", "Couldnt find any resource", "Not found"));
    }

    @Override
    public String getErrorPath() {
        return "/error";
    }
}
