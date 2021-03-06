package com.example.animals;

import com.example.model.AbilityMessage;
import com.example.model.AbstractAnimal;
import com.example.model.FlyAbility;

/**
 * A <code>Butterfly</code> can only fly.
 *
 */
public class Butterfly extends AbstractAnimal
        implements FlyAbility {

    @Override
    public String fly() {
        return executeAbility(AbilityMessage.FLIGHT);
    }
}
