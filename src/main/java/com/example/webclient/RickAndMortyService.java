package com.example.webclient;

import lombok.Data;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;
import java.util.Objects;

@Data
@Service
public class RickAndMortyService {

    private final WebClient webClient = WebClient.create("https://rickandmortyapi.com/api");


    List<RickAndMortyCharacter> getCharacters() {
        ResponseEntity<RickAndMortyApiResponse> responseEntity = webClient.get()
                .uri("/character")
                .retrieve()
                .toEntity(RickAndMortyApiResponse.class)
                .block();

//        RickAndMortyApiResponse rickAndMortyApiResponse = Objects.requireNonNull(responseEntity).getBody();
//        return Objects.requireNonNull(rickAndMortyApiResponse).results();



        return Objects.requireNonNull(responseEntity).getBody().results();
    }
}
