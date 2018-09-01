package com.example.model;

public enum Ability {
    WALK("I am walking.", "I cannot walk."),
    FLIGHT("I am flying.", "I cannot fly."),
    SWIM("I am swimming.", "I cannot swim."),
    SING("I am singing.", "I cannot sing."),

    MAKE_JOKE("I have a joke.", "I don't have a joke."),
    EAT_OWN_KIND("I eat my own kind.", "I don't eat my own kind."),

    MORPH("I am morphing.", "I cannot morph.");

    Ability(String message, String errorMessage) {
        this.message = message;
        this.errorMessage = errorMessage;
    }

    private String message;
    private String errorMessage;

    public String getMessage() {
        return message;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

}
