package com.chris.peliculas.controller;

import com.chris.peliculas.dao.IGeneroRepository;
import com.chris.peliculas.entities.Genero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class GeneroController {

    @Autowired
    private IGeneroRepository generoRepository;

    @PostMapping("genero")
    public long saveGenero(@RequestParam String nombre){
        Genero genero = new Genero();
        genero.setNombre(nombre);

        generoRepository.save(genero);

        return genero.getId();
    }

    @GetMapping("genero/{id}")
    public String fingById(@PathVariable(name="id") Long id){
        Genero genero = generoRepository.findById(id);

        return genero.getNombre();
    }
}
