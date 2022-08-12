package com.alkemy.icons.icons.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table( name = "movie_serie")
@Getter
@Setter

public class MovieOrSerie {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String name;
    private String title;
    @Column(name = "create_at")
    @DateTimeFormat(pattern = "yyy/MM/dd")
    private String createAt;
    private double rating;
    private String actors;
    // relacion manytomany
    @ManyToMany(
            cascade = {
                    CascadeType.PERSIST,
                    CascadeType.MERGE
            }
    )
    //relacion entre pelicula y personaje
    @JoinTable(
            name = "movie_character",
            joinColumns = @JoinColumn(name = "movie_id"),
            inverseJoinColumns = @JoinColumn(name = "character_id")
    )
    private Set<MovieOrSerie> movieCharacter = new HashSet<>();

    //relacion entre pelicula y gnenero.
    @ManyToMany(
            cascade = {
                    CascadeType.PERSIST,
                    CascadeType.MERGE
            }
    )
    @JoinTable(
            name = "movie_gender",
            joinColumns = @JoinColumn(name = "movie_id"),
            inverseJoinColumns = @JoinColumn(name = "gender_id")
    )
    private Set<MovieOrSerie> movieGender = new HashSet<>();
}
