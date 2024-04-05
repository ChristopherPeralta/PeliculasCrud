package com.chris.peliculas.service;

import com.chris.peliculas.entities.Pelicula;

import java.util.List;

public interface PeliculaService {

    public void save(Pelicula pelicula);
    public Pelicula findById(Long id);
    public List<Pelicula> findAll();
    public void delete(Long id);
}
