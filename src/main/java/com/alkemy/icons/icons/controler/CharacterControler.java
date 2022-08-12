package com.alkemy.icons.icons.controler;


import com.alkemy.icons.icons.dto.CharacterDto;
import com.alkemy.icons.icons.entity.Character;
import com.alkemy.icons.icons.service.CharacterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("characters")
public class CharacterControler {

    @Autowired
    private CharacterService characterService;

    @PostMapping
    public ResponseEntity<CharacterDto> save(@RequestBody CharacterDto character) {
        //save character
        //201 status code
        CharacterDto charactersave = characterService.save(character);
        return ResponseEntity.status(HttpStatus.CREATED).body(charactersave);
    }

}
