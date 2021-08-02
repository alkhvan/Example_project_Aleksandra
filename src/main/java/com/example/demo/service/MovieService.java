package com.example.demo.service;

import com.example.demo.model.Movie;
import com.example.demo.repositories.MovieRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class MovieService {

    @Autowired
    private MovieRepo movieRepo;

    public List<Movie> getAll(){
         return (List<Movie>) this.movieRepo.findAll();
    }

    public  Movie postMovie( @RequestBody Movie movie){
        return this.movieRepo.save(movie);
    }
}
