package com.backend.api.controller;

import com.backend.api.dtos.CharacterDTO;
import com.backend.api.service.CharacterService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/characters")
@AllArgsConstructor
public class CharacterController {

    private final CharacterService characterService;

    @GetMapping
    public ResponseEntity<List<CharacterDTO>> getAll() {
        return ResponseEntity.ok(characterService.getAllCharacters());
    }

    @PostMapping
    public ResponseEntity<CharacterDTO> post(@RequestBody CharacterDTO request) {
        return ResponseEntity.ok(characterService.createCharacter(request));
    }

    @GetMapping("/{name}")
    public ResponseEntity<List<CharacterDTO>> getByName(@PathVariable String name){
        return ResponseEntity.ok(characterService.searchByName(name));
    }
}
