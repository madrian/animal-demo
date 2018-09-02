package com.example.animals;

import com.example.model.*;

/**
 * A <code>Cat</code> can walk, swim and sing.
 *
 */
public class Cat extends AbstractAnimal
        implements WalkAbility, SingAbility, SwimAbility {

    public Cat() {
        song = "Meow.";
    }

    @Override
    public String walk() {
        return executeAbility(AbilityMessage.WALK);
    }

    @Override
    public String swim() {
        return executeAbility(AbilityMessage.SWIM);
    }

    @Override
    public String sing() {
        return executeAbility(AbilityMessage.SING, song);
    }
}
