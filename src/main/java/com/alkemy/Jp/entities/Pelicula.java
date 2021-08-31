package com.alkemy.Jp.entities;


import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Pelicula implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IDpelicula;
    private String imagen;
    private String titulo;
    private String fechaCreacion;
    private Integer calificacion;
    @ManyToMany
    private List<Personaje> personajes;



}
