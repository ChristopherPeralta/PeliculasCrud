package com.chris.peliculas.service;

import com.chris.peliculas.entities.Genero;

import java.util.List;

public interface GeneroService {

    public void save(Genero genero);
    public Genero findById(Long id);
    public void delete(Long id);
    public List<Genero> findAll();
}
