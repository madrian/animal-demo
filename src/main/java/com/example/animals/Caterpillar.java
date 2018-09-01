package com.example.animals;

import com.example.model.Ability;
import com.example.model.AbstractAnimal;

/**
 * Caterpillar implementation of an <code>Animal</code>.
 */
public class Caterpillar extends AbstractAnimal {

    public Caterpillar() {
        abilities.remove(Ability.FLIGHT);
        abilities.remove(Ability.SING);
        abilities.remove(Ability.SWIM);
    }
}
