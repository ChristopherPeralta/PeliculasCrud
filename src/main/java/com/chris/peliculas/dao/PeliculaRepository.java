package com.chris.peliculas.dao;

import com.chris.peliculas.entities.Pelicula;
import org.springframework.data.repository.CrudRepository;

public interface PeliculaRepository extends CrudRepository<Pelicula, Long> {



}
