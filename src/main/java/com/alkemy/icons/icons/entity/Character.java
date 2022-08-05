package com.alkemy.icons.icons.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table( name = "character")
@Getter
@Setter
public class Character {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String name;
    private String image;
    private int age;
    private double weight;
    private String history;
    private String movie_serie;

    private String movie_seri;
}
