package com.example.demo.service;

import com.example.demo.model.Movie;
import com.example.demo.repositories.MovieRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    @Autowired
    private MovieRepo movieRepo;

    public List<Movie> getAll(){
         return (List<Movie>) this.movieRepo.findAll();
    }

    public  List<Movie> postMovie(Movie movie){
        return (List<Movie>) this.movieRepo.save(movie);
    }
}
