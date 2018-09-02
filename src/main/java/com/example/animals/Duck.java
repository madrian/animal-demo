package com.example.animals;

import com.example.model.AbilityMessage;
import com.example.model.SwimAbility;

/**
 * A <code>Duck</code> is a flying bird that can also swim.
 *
 */
public class Duck extends FlyingBird implements SwimAbility {

    public Duck() {
        song = "Quack, quack.";
    }

    @Override
    public String swim() {
        return executeAbility(AbilityMessage.SWIM);
    }
}
