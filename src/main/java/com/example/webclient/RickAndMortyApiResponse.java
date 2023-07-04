package com.example.webclient;

import java.util.List;

public record RickAndMortyApiResponse(
        List<RickAndMortyCharacter> results
) {
}
