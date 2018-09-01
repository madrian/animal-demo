package com.example.animals;

import com.example.model.Animal;

/**
 * Dolphin implementation of an <code>Animal</code>.
 *
 * <p>This class wraps the <code>Fish</code> class thus sharing the same
 * attributes and behaviors with fish.</p>
 */
public class Dolphin implements Animal {
    private Fish fish;

    public Dolphin() {
        fish = new Fish();
    }

    @Override
    public String walk() {
        return fish.walk();
    }

    @Override
    public String fly() {
        return fish.fly();
    }

    @Override
    public String sing() {
        return fish.sing();
    }

    @Override
    public String swim() {
        return fish.swim();
    }

    @Override
    public String makeJoke() {
        return fish.makeJoke();
    }

    @Override
    public String eatOwnKind() {
        return fish.eatOwnKind();
    }

    @Override
    public Animal morph() {
        return this;
    }
}
