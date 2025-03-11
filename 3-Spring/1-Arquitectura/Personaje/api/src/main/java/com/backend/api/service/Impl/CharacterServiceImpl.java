package com.backend.api.service.Impl;



import com.backend.api.dtos.CharacterDTO;
import com.backend.api.entities.CharacterEntity;
import com.backend.api.exception.ExistEntityException;
import com.backend.api.mapper.CharacterMapper;
import com.backend.api.repository.CharacterRepository;
import com.backend.api.service.CharacterService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CharacterServiceImpl implements CharacterService {

    private final CharacterRepository characterRepository;
    private final CharacterMapper characterMapper;

    @Override
    public List<CharacterDTO> getAllCharacters() {
        return characterRepository.findAll().stream().map(characterMapper::toCharacterDTO).toList();
    }

    @Override
    public CharacterDTO createCharacter(CharacterDTO characterDTO) {
        CharacterEntity characterSaved = characterRepository.save(characterMapper.toCharacter(characterDTO));
        if(characterSaved == null) throw new ExistEntityException("Ya existe el personaje");
        return characterMapper.toCharacterDTO(characterSaved);
    }

    @Override
    public List<CharacterDTO> searchByName(String name) {
        return characterRepository.findAll().stream()
                .filter(characterEntity -> characterEntity.getName().equals(name))
                .map(characterMapper::toCharacterDTO)
                .toList();
    }
}
