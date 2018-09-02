package com.example.model;

import static com.example.util.AnimalHelper.log;

/**
 * Abstract base class of the <code>Animal</code> interface.
 */
public abstract class AbstractAnimal implements Animal {
    protected String song;
    protected AnimalColor color;
    protected AnimalSize size;

    protected AbstractAnimal() {
        song = AbilityMessage.SING.getMessage();
    }

    protected String executeAbility(AbilityMessage abilityMessage,
                                    String customMessage) {
        String s = customMessage == null || customMessage.length() == 0 ?
                abilityMessage.getMessage() : customMessage;
        log(s);
        return s;
    }

    protected String executeAbility(AbilityMessage abilityMessage) {
        return executeAbility(abilityMessage, null);
    }

    public AnimalColor getColor() {
        return color;
    }

    public AnimalSize getSize() {
        return size;
    }
}
