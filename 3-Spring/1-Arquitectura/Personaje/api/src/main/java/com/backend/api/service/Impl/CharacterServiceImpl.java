package com.backend.api.service.Impl;



import com.backend.api.dtos.CharacterDTO;
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
        return characterMapper.toCharacterDTO(characterRepository.save(characterMapper.toCharacter(characterDTO)));
    }
}
