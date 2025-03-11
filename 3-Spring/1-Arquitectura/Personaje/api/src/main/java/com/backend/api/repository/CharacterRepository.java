package com.backend.api.repository;

import com.backend.api.entities.CharacterEntity;

import java.util.List;

public interface CharacterRepository {

    List<CharacterEntity> findAll();
    CharacterEntity save(CharacterEntity character);
}
