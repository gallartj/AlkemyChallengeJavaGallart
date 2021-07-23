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
public class Genero implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IDgenero;
    private String nombre;
    private Byte[] imagen;
    @OneToMany
    private List<Pelicula> peliculasAsociadas;




}
