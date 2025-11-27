package com.example.character_service.factory;

import com.example.characterservice.model.Character;

// Interface que define o "contrato" da fábrica [cite: 619]
public interface CharacterFactory {
    Character createCharacter(String name);
}