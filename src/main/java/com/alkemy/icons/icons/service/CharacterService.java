package com.alkemy.icons.icons.service;


import com.alkemy.icons.icons.dto.CharacterDto;
import org.springframework.stereotype.Service;

@Service
public class CharacterService {

    public CharacterDto save(CharacterDto dto) {
        // TODO: guardar
        System.out.println("guardar");
        return dto;
    }
}
