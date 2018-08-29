package com.example.animals;

/**
 * Chicken implementation of an <code>Animal</code>.
 */
public class Chicken extends Bird {

    @Override
    public String sing() {
        String message = "Cluck, cluck.";
        log(message);
        return message;
    }

    @Override
    public String fly() {
        String message = "I cannot fly.";
        log(message);
        return message;
    }
}
