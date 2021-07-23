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
public class Personaje implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IDpersonaje;
    private Byte[] imagen;
    private String nombre;
    private Integer edad;
    private Double peso;
    private String historia;
    @ManyToMany
    private List<Pelicula> peliculas;




}
