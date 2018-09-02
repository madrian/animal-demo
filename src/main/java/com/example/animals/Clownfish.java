package com.example.animals;

import com.example.model.AbilityMessage;
import com.example.model.AnimalColor;
import com.example.model.AnimalSize;
import com.example.model.MakeJokeAbility;

/**
 * A <code>Clownfish</code> is a <code>Fish</code> that can make jokes.
 *
 */
public class Clownfish extends Fish implements MakeJokeAbility {

    public Clownfish() {
        color = AnimalColor.ORANGE;
        size = AnimalSize.SMALL;
    }

    @Override
    public String makeJoke() {
        return executeAbility(AbilityMessage.MAKE_JOKE);
    }

}
