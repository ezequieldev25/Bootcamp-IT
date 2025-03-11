package com.backend.apimorse.controllers;

import jakarta.websocket.server.PathParam;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

@RestController
public class MorseController {

    @GetMapping("/translate/{text}")
    public ResponseEntity<String> translateToSpain(@PathParam("text") String text) {
        return ResponseEntity.ok(translate(text));
    }

    private String translate(String text) {
        StringBuilder result = new StringBuilder();

        Stream.of(text.split(" {3}"))
                .forEach(w -> result.append(translateWord(w)).append(" "));

        return result.toString();
    }

    private String translateWord(String word) {
        String[] letters = word.split(" ");
        StringBuilder result = new StringBuilder();


        return result.toString();
    }

    private static Map<String, String> mapToSpain = new HashMap<>();
}
