package com.chris.peliculas.service;

import com.chris.peliculas.dao.PeliculaRepository;
import com.chris.peliculas.entities.Pelicula;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PeliculaServiceImpl implements PeliculaService{

    @Autowired
    private PeliculaRepository peliculaRepository;

    @Override
    public void save(Pelicula pelicula) {
        peliculaRepository.save(pelicula);
    }

    @Override
    public Pelicula findById(Long id) {
        return peliculaRepository.findById(id).orElse(null);
    }

    @Override
    public List<Pelicula> findAll() {
        return (List<Pelicula>) peliculaRepository.findAll();
    }

    @Override
    public void delete(Long id) {
        peliculaRepository.deleteById(id);
    }
}
