package com.example.demo.model;

import java.util.Objects;

public class Movie {
    private Long id;
    private String name;
    private String language;
    private String description;
    private String director;
    private String producer;
    private String productionCompany;

    public Movie() {
    }

    public Movie(Long id, String name, String language, String description, String director, String producer, String productionCompany) {
        this.id = id;
        this.name = name;
        this.language = language;
        this.description = description;
        this.director = director;
        this.producer = producer;
        this.productionCompany = productionCompany;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getProductionCompany() {
        return productionCompany;
    }

    public void setProductionCompany(String productionCompany) {
        this.productionCompany = productionCompany;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return id == movie.id &&
                name.equals(movie.name) &&
                Objects.equals(language, movie.language) &&
                Objects.equals(description, movie.description) &&
                Objects.equals(director, movie.director) &&
                Objects.equals(producer, movie.producer) &&
                Objects.equals(productionCompany, movie.productionCompany);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, language, description, director, producer, productionCompany);
    }
}
