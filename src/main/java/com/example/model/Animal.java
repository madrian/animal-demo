package com.example.model;

import java.util.Set;

/**
 * Defines an animal and its abilities.
 */
public interface Animal extends SingAbility {
    String walk();

    String fly();

    String swim();

    String makeJoke();

    String eatOwnKind();

    Animal morph();

    Set<Ability> getAbilities();
}
