package com.example.character_service.repository;

import com.example.characterservice.model.Character;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CharacterRepository extends JpaRepository<Character, Long> {
    // Graças à herança, esse repositório busca tanto Mages quanto Warriors!
}