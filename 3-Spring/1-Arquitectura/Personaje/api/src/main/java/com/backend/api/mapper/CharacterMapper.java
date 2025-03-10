package com.backend.api.mapper;

import com.backend.api.dtos.CharacterDTO;
import com.backend.api.entities.CharacterEntity;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class CharacterMapper {

    public CharacterDTO toCharacterDTO(CharacterEntity character){
        CharacterDTO characterDTO = new CharacterDTO();
        BeanUtils.copyProperties(character, characterDTO);
        return characterDTO;
    }
}
