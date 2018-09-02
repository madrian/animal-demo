package com.example.animals;

import com.example.model.*;

/**
 * A <code>Dog</code> can walk, swim and sing.
 *
 */
public class Dog extends AbstractAnimal
        implements WalkAbility, SingAbility, SwimAbility {

    public Dog() {
        song = "Woof, woof.";
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
