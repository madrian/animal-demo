package com.example.animals;

import com.example.model.Ability;

/**
 * Chicken implementation of an <code>Animal</code>.
 */
public class Chicken extends Bird {

    public Chicken() {
        abilities.remove(Ability.FLIGHT);
        song = "Cluck, cluck.";
    }
}
