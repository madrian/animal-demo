package com.example.model;

/**
 * Abstract base class of the <code>Animal</code> interface.
 */
public abstract class AbstractAnimal implements Animal {

    public String walk() {
        String message = "I am walking.";
        log(message);
        return message;
    }

    public String fly() {
        String message = "I am flying.";
        log(message);
        return message;
    }

    public String sing() {
        String message = "I am singing.";
        log(message);
        return message;
    }

    protected void log(String message) {
        System.out.println(message);
    }
}
