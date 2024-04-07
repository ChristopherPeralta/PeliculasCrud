package com.chris.peliculas.service;

import com.chris.peliculas.entities.Actor;

import java.util.List;

public interface ActorService {

    public List<Actor> findAll();
    public List<Actor> findAllById(List<Long> ids);

}
