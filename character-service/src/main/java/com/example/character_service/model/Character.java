package com.example.character_service.model;

import jakarta.persistence.*;
import lombok.Data;

@Data // O Lombok gera Getters e Setters automaticamente
@Entity
@Table(name = "characters")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE) // Estratégia de herança no banco
@DiscriminatorColumn(name = "class_type", discriminatorType = DiscriminatorType.STRING)
public abstract class Character {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    // Atributos base definidos no seu diagrama
    private int health;
    private int attackPower;

    // Construtor vazio (obrigatório pro JPA)
    public Character() {}

    public Character(String name, int health, int attackPower) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
    }
}