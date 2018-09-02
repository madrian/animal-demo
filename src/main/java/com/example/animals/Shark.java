package com.example.animals;

import com.example.model.AbilityMessage;
import com.example.model.AnimalColor;
import com.example.model.AnimalSize;
import com.example.model.EatOwnKindAbility;

/**
 * A <code>Shark</code> is a <code>Fish</code> that eats its own kind.
 *
 */
public class Shark extends Fish implements EatOwnKindAbility {

    public Shark() {
        color = AnimalColor.GREY;
        size = AnimalSize.LARGE;
    }

    @Override
    public String eatOwnKind() {
        return executeAbility(AbilityMessage.EAT_OWN_KIND);
    }
}
