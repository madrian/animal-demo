package com.example.model;

import java.util.Set;

/**
 * Defines an animal and its abilities.
 */
public interface Animal {
    String walk();

    String fly();

    String sing();

    String swim();

    String makeJoke();

    String eatOwnKind();

    Animal morph();

    Set<Ability> getAbilities();
}
