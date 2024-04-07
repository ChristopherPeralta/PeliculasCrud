package com.chris.peliculas.service;

import com.chris.peliculas.dao.ActorRepository;
import com.chris.peliculas.entities.Actor;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActorServiceImpl implements ActorService {

    @Autowired
    private ActorRepository repo;

    public List<Actor> findAll() {
        return (List<Actor>) repo.findAll();
    }

    public List<Actor> findAllById(List<Long> ids) {
        return (List<Actor>) repo.findAllById(ids);
    }

}