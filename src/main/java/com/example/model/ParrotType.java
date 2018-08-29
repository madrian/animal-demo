package com.example.model;

/**
 * Defines different types of <code>Parrot</code>s.
 * <p>Each <code>ParrotType</code> can be defined with its own song.</p>
 */
public enum ParrotType {
    DOGGY_PARROT("Woof, woof."),
    KITTY_PARROT("Meow."),
    COCKY_PARROT("Cock-a-doodle-doo."),
    QUACKY_PARROT("Quack, quack."),
    PHONY_PARROT("Riiiiing, riiiiing.");

    private String song;

    ParrotType(String song) {
        this.song = song;
    }

    public String getSong() {
        return this.song;
    }
}