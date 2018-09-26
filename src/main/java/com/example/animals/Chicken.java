package com.example.animals;

import com.example.model.AnimalGender;

/**
 * A <code>Chicken</code> is a non-flying bird. It sings differently than a
 * <code>Bird</code>.
 *
 */
public class Chicken extends Bird {
    protected AnimalGender gender;

    public Chicken() {
        song = "Cluck, cluck.";
    }
}
