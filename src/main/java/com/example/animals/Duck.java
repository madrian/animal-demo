package com.example.animals;

import com.example.model.Ability;

/**
 * Duck implementation of an <code>Animal</code>.
 */
public class Duck extends Bird {

    public Duck() {
        song = "Quack, quack.";
        abilities.add(Ability.SWIM);
    }
}
