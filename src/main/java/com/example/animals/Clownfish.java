package com.example.animals;

import com.example.model.Ability;
import com.example.model.AnimalColor;
import com.example.model.AnimalSize;

/**
 * Clownfish implementation of a <code>Fish</code>.
 */
public class Clownfish extends Fish {

    public Clownfish() {
        color = AnimalColor.ORANGE;
        size = AnimalSize.SMALL;
        abilities.add(Ability.MAKE_JOKE);
    }
}
