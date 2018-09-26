package com.example.animals;

import com.example.model.AbilityMessage;
import com.example.model.AbstractAnimal;
import com.example.model.SingAbility;
import com.example.model.WalkAbility;

/**
 * A <code>Bird</code> can walk and sing.
 *
 * <p>This is a top category bird and since not all birds can fly, this does
 * not fly. Use {@link FlyingBird} for the common flying birds.</p>
 *
 */
public class Bird extends AbstractAnimal
        implements WalkAbility, SingAbility {

    public Bird() {
        song = "Tweet, tweet.";
    }

    @Override
    public String sing() {
        return executeAbility(AbilityMessage.SING, song);
    }
}
