package com.chris.peliculas.dao;

import com.chris.peliculas.entities.Actor;
import org.springframework.data.repository.CrudRepository;

public interface ActorRepository extends CrudRepository<Actor, Long> {
}
