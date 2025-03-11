package com.backend.apimorse.controllers;

import com.backend.apimorse.services.MorseService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/api/morse")
public class MorseController {

    private final MorseService morseService;

    @GetMapping("/{text}/spain")
    public ResponseEntity<String> translateToSpain(@PathVariable String text) {
        return ResponseEntity.ok(morseService.translateToSpain(text));
    }

    @GetMapping("/spain/{morse}/")
    public ResponseEntity<String> translateSpainToMorse(@PathVariable String morse){
        return ResponseEntity.ok(morseService.translateSpainToMorse(morse));
    }
}
