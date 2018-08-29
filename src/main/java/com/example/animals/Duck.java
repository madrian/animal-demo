package com.example.animals;

/**
 * Duck implementation of an <code>Animal</code>.
 */
public class Duck extends Bird {

    @Override
    public String sing() {
        String message = "Quack, quack.";
        log(message);
        return message;
    }
}
