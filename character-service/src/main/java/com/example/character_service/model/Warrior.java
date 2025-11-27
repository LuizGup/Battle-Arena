package com.example.character_service.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@DiscriminatorValue("WARRIOR")
public class Warrior extends Character {

    private int defense;

    public Warrior() {}

    public Warrior(String name, int health, int attackPower, int defense) {
        super(name, health, attackPower);
        this.defense = defense;
    }
}