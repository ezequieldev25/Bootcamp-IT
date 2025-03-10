package com.backend.api.repository.impl;

import com.backend.api.entities.CharacterEntity;
import com.backend.api.repository.CharacterRepository;
import com.backend.api.util.JsonUtils;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@AllArgsConstructor
public class CharacterRepositoryImpl implements CharacterRepository {

    @Override
    public List<CharacterEntity> findAll() {
        return JsonUtils.loadDataBase("starwars_characters.json");
    }
}