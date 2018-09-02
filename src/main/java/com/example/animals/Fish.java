package com.example.animals;

import com.example.model.AbilityMessage;
import com.example.model.AbstractAnimal;
import com.example.model.SwimAbility;

/**
 * A <code>Fish</code> can swim.
 *
 */
public class Fish extends AbstractAnimal
        implements SwimAbility {

    @Override
    public String swim() {
        return executeAbility(AbilityMessage.SWIM);
    }
}
