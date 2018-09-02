package com.example.animals;

import com.example.model.Animal;
import com.example.model.SwimAbility;

/**
 * A <code>Dolphin</code> swims like a fish but is not a fish.
 *
 * <p>This class wraps the <code>Fish</code> class thus sharing the same
 * attributes and behaviors with fish but does not inherit them.</p>
 *
 */
public class Dolphin implements Animal, SwimAbility {
    private Fish fish;

    public Dolphin() {
        fish = new Fish();
    }

    @Override
    public String swim () {
        return fish.swim();
    }
}
