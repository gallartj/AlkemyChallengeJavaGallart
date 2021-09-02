package com.alkemy.Jp.entities;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity

@Getter
@Setter

@AllArgsConstructor
@NoArgsConstructor
public class Personaje implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdPersonaje;
    private String imagen;
    private String nombre;
    private Integer edad;
    private Double peso;
    private String historia;
    @JsonIgnore
    @ManyToMany(mappedBy = "personajes")
    private List<Pelicula> peliculas;




}
