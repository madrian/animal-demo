package com.example.animals;

import com.example.model.Ability;
import com.example.model.AbstractAnimal;

/**
 * Bird implementation of an <code>Animal</code>.
 */
public class Dog extends AbstractAnimal {

    public Dog() {
        song = "Woof, woof.";
        abilities.remove(Ability.FLIGHT);
    }
}
