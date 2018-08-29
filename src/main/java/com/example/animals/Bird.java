package com.example.animals;

import com.example.model.AbstractAnimal;

/**
 * Bird implementation of an <code>Animal</code>.
 */
class Bird extends AbstractAnimal {

    @Override
    public String sing() {
        String message = "Tweet, tweet.";
        log(message);
        return message;
    }
}
