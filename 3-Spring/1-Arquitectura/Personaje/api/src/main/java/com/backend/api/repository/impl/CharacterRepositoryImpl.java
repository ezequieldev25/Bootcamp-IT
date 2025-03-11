package com.backend.api.repository.impl;

import com.backend.api.entities.CharacterEntity;
import com.backend.api.repository.CharacterRepository;
import com.backend.api.util.JsonUtils;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CharacterRepositoryImpl implements CharacterRepository {

    private final List<CharacterEntity> database;

    public CharacterRepositoryImpl(){
        database = JsonUtils.loadDataBase("starwars_characters.json");
    }

    @Override
    public List<CharacterEntity> findAll() {
        return database;
    }

    @Override
    public CharacterEntity save(CharacterEntity character) {
        if(database.contains(character)) return null;
        database.add(character);
        return character;
    }
}