package com.backend.apimorse.controllers;

import com.backend.apimorse.services.MorseService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class MorseController {

    private final MorseService morseService;

    @GetMapping("/translate/{text}")
    public ResponseEntity<String> translateToSpain(@PathVariable String text) {
        return ResponseEntity.ok(morseService.translateToSpain(text));
    }
}
