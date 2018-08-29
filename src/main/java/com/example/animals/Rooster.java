package com.example.animals;

import com.example.model.Animal;

/**
 * Rooster implementation without inheritance.
 */
public class Rooster implements Animal {
    private Chicken chicken;

    public Rooster() {
        //a rooster is just a chicken inside!
        chicken = new Chicken();
    }

    public String walk() {
        return chicken.walk();
    }

    public String fly() {
        return chicken.fly();
    }

    /**
     * A rooster is just a chicken but sings differently.
     *
     * @return rooster song
     */
    public String sing() {
        String message = "Cock-a-doodle-doo.";
        //TODO refactor log in AbstractAnimal to a util method
        System.out.println(message);
        return message;
    }

    public String swim() {
        return chicken.swim();
    }
}
