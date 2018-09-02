package com.example.animals;

import com.example.model.Ability;
import com.example.model.AbstractAnimal;

/**
 * Bird implementation of an <code>Animal</code>.
 */
public class Cat extends AbstractAnimal {

    public Cat() {
        song = "Meow.";
        abilities.remove(Ability.FLIGHT);
    }
}
