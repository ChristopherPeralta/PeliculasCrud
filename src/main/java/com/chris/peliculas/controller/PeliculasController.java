package com.chris.peliculas.controller;

import com.chris.peliculas.entities.Actor;
import com.chris.peliculas.entities.Pelicula;
import com.chris.peliculas.service.ActorService;
import com.chris.peliculas.service.GeneroService;
import com.chris.peliculas.service.PeliculaService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Controller

public class PeliculasController {

    @Autowired
    private PeliculaService peliculaService;

    @Autowired
    private GeneroService generoService;

    @Autowired
    private ActorService actorService;

    @GetMapping("/pelicula")
    public String crear(Model model) {
        Pelicula pelicula = new Pelicula();
        model.addAttribute("pelicula", pelicula);
        model.addAttribute("generos", generoService.findAll());
        model.addAttribute("actores", actorService.findAll());
        model.addAttribute("titulo", "Nueva Pelicula");
        return "pelicula";
    }

    @GetMapping("/pelicula/{id}")
    public String editar(@PathVariable(name = "id") Long id, Model model) {
        Pelicula pelicula = new Pelicula();
        model.addAttribute("pelicula", pelicula);
        model.addAttribute("generos", generoService.findAll());
        model.addAttribute("actores", actorService.findAll());
        model.addAttribute("tidulo", "Editar Pelicula");
        return "pelicula";
    }

    @PostMapping("/pelicula")
    public String guardar(Pelicula pelicula, @ModelAttribute("ids") String ids) {

        List<Long> idsProtagonistas = Arrays.stream(ids.split(",")).map(Long::parseLong).toList();
        List<Actor> protagonistas = actorService.findAllById(idsProtagonistas);
        pelicula.setProtagonistas(actorService.findAllById(idsProtagonistas));

        peliculaService.save(pelicula);
        return "redirect:/home";
    }

    @GetMapping({"/", "home","/index"})
    public String home() {
        return "home";
    }

}
