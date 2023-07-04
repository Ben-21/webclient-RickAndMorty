package com.example.webclient;


import lombok.Data;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Data
@RestController
@RequestMapping("/api")
public class RickAndMortyController {

    private final RickAndMortyService rickAndMortyService;


    @GetMapping("/character")
    public List<RickAndMortyCharacter> getCharacters() {
        return rickAndMortyService.getCharacters();
    }
}
