package com.example.animals;

import com.example.model.Ability;
import com.example.model.AbstractAnimal;

/**
 * Butterfly implementation of an <code>Animal</code>.
 */
public class Butterfly extends AbstractAnimal {

    public Butterfly() {
        abilities.remove(Ability.WALK);
        abilities.remove(Ability.SING);
        abilities.remove(Ability.SWIM);
    }
}
