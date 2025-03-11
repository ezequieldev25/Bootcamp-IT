package com.backend.api.service;

import com.backend.api.dtos.CharacterDTO;

import java.io.IOException;
import java.util.List;

public interface CharacterService {

    List<CharacterDTO> getAllCharacters();
    CharacterDTO createCharacter(CharacterDTO characterDTO);
}
