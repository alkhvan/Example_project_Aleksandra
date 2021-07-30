package com.example.demo.controller;

import com.example.demo.model.Movie;
import com.example.demo.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MovieController {
    private MovieService movieService;

    @Autowired
    public MovieController(MovieService movieService) {
        super();
        this.movieService = movieService;
    }

    @GetMapping("/all")
    public List<Movie> getAll(@PathVariable("id") long id){
        return this.movieService.getAll();
    }

    @PostMapping("/")
    public List<Movie> postMovie(Movie movie){
        return this.movieService.postMovie(movie);
    }


}
