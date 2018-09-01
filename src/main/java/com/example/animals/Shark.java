package com.example.animals;

import com.example.model.Ability;
import com.example.model.AnimalColor;
import com.example.model.AnimalSize;

/**
 * Shark implementation of a <code>Fish</code>.
 */
public class Shark extends Fish {

    public Shark() {
        color = AnimalColor.GREY;
        size = AnimalSize.LARGE;
        abilities.add(Ability.EAT_OWN_KIND);
    }
}
