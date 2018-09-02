package com.example.animals;

import com.example.model.*;

/**
 * A <code>Caterpillar</code> can walk and morph into a <code>Butterfly</code>.
 *
 */
public class Caterpillar extends AbstractAnimal
        implements WalkAbility, MorphAbility {

    @Override
    public String walk() {
        return executeAbility(AbilityMessage.WALK);
    }

    @Override
    public Animal morph() {
        executeAbility(AbilityMessage.MORPH);
        return new Butterfly();
    }

}
