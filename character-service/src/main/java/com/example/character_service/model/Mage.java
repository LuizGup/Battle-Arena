package com.example.character_service.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@DiscriminatorValue("MAGE") // O que vai ser escrito no banco na coluna class_type
public class Mage extends Character {

    private int mana;

    public Mage() {}

    public Mage(String name, int health, int attackPower, int mana) {
        super(name, health, attackPower);
        this.mana = mana;
    }
}