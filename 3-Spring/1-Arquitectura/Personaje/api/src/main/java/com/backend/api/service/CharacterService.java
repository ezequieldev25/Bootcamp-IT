package com.backend.api.service;

import com.backend.api.dtos.CharacterDTO;

import java.util.List;

public interface CharacterService {

    List<CharacterDTO> getAllCharacters();
    CharacterDTO createCharacter(CharacterDTO characterDTO);
    List<CharacterDTO> searchByName(String name);
}
