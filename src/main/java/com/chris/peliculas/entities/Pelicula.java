package com.chris.peliculas.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "peliculas")
public class Pelicula implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;

    @Column(name = "fecha_estreno")
    @Temporal(TemporalType.DATE)
    private String fechaEstreno;
    
    private Genero genero;
    private List<Actor> protagonistas;
}
