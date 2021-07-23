package com.alkemy.Jp.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pelicula implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IDpelicula;
    private Byte[] imagen;
    private String titulo;
    private String fechaCreacion;
    private Integer calificacion;
    @ManyToMany
    private List<Personaje> personajesAsociados;



}
