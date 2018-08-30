package com.example.animals;

import com.example.model.Ability;
import com.example.model.AbstractAnimal;

public class Fish extends AbstractAnimal {

    public Fish() {
        abilities.remove(Ability.SING);
        abilities.remove(Ability.WALK);
        abilities.remove(Ability.FLIGHT);
    }
}
