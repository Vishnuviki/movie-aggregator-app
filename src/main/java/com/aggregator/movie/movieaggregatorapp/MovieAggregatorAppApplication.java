package com.aggregator.movie.movieaggregatorapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MovieAggregatorAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieAggregatorAppApplication.class, args);
	}

}
