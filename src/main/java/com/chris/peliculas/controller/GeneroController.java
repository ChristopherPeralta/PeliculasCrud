package com.chris.peliculas.controller;

import com.chris.peliculas.dao.GeneroRepository;
import com.chris.peliculas.entities.Genero;
import com.chris.peliculas.service.GeneroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class GeneroController {

    @Autowired
    private GeneroService generoService;

    @PostMapping("genero")
    public long saveGenero(@RequestParam String nombre){
        Genero genero = new Genero();
        genero.setNombre(nombre);

        generoService.save(genero);

        return genero.getId();
    }

    @GetMapping("genero/{id}")
    public String fingById(@PathVariable(name="id") Long id){
        Genero genero = generoService.findById(id);

        return genero.getNombre();
    }
}
