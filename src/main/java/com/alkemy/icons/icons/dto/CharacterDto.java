package com.alkemy.icons.icons.dto;


import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CharacterDto {
    private Long id;
    private String name;
    private String image;
    private int age;
    private double weight;
    private String history;
    private String movie_serie;
}
