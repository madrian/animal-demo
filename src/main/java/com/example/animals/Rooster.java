package com.example.animals;

import com.example.model.Ability;
import com.example.model.Animal;

import java.util.Set;

import static com.example.util.AnimalHelper.log;

/**
 * Rooster implementation without inheritance.
 */
public class Rooster implements Animal {
    private Chicken chicken;

    public Rooster() {
        //a rooster is just a chicken inside!
        chicken = new Chicken();
    }

    @Override
    public String walk() {
        return chicken.walk();
    }

    @Override
    public String fly() {
        return chicken.fly();
    }

    /**
     * A rooster is just a chicken but sings differently.
     *
     * @return rooster song
     */
    @Override
    public String sing() {
        String message = "Cock-a-doodle-doo.";
        log(message);
        System.out.println(message);
        return message;
    }

    @Override
    public String swim() {
        return chicken.swim();
    }

    @Override
    public String makeJoke() {
        return chicken.makeJoke();
    }

    @Override
    public String eatOwnKind() {
        return chicken.eatOwnKind();
    }

    @Override
    public Animal morph() {
        return this;
    }

    @Override
    public Set<Ability> getAbilities() {
        return chicken.getAbilities();
    }
}
