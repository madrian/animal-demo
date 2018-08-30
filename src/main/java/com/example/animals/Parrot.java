package com.example.animals;

import com.example.model.ParrotType;

/**
 * Parrot implementation of a <code>Bird</code>.
 *
 */
public class Parrot extends Bird {
    private ParrotType type;

    public Parrot(ParrotType type) {
        this.type = type;
        song = type.getSong();
    }

}
