package com.backend.api.controller;

import com.backend.api.dtos.CharacterDTO;
import com.backend.api.service.CharacterService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api/characters")
@AllArgsConstructor
public class CharacterController {

    private final CharacterService characterService;

    @GetMapping
    public ResponseEntity<List<CharacterDTO>> getAll() throws IOException {
        return ResponseEntity.ok(characterService.getAllCharacters());
    }
}
