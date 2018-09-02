package com.example.animals;

import com.example.model.AbilityMessage;
import com.example.model.FlyAbility;

/**
 * A <code>FlyingBird</code> is a bird that can fly.
 *
 */
public class FlyingBird extends Bird implements FlyAbility {

    @Override
    public String fly() {
        return executeAbility(AbilityMessage.FLIGHT);
    }

}
