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
public class Genero implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IDgenero;
    private String nombre;
    private String imagen;
    @OneToMany
    private List<Pelicula> peliculasAsociadas;




}
