package com.example.demo.controller;

import com.example.demo.model.Movie;
import com.example.demo.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping("/all")
    public List<Movie> getAll(@PathVariable("id") long id){
        return this.movieService.getAll();
    }

    @PostMapping("/")
    public Movie postMovie(Movie movie){
        return this.movieService.postMovie(movie);
    }


}
