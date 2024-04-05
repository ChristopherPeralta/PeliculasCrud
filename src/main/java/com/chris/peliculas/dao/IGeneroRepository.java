package com.chris.peliculas.dao;

import com.chris.peliculas.entities.Genero;

public interface IGeneroRepository {

    public void save(Genero genero);
    public Genero findById(Long id);
}
