package com.example.model;

public enum Ability {
    WALK("I am walking.", "I cannot walk."),
    FLIGHT("I am flying.", "I cannot fly."),
    SWIM("I am swimming.", "I cannot swim."),
    SING("I am singing.", "I cannot sing.");

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
