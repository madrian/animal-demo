package com.example.model;

import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;

/**
 * Abstract base class of the <code>Animal</code> interface.
 */
public abstract class AbstractAnimal implements Animal {
    protected Set<Ability> abilities = new HashSet<>();
    protected String song;
    protected AnimalColor color;
    protected AnimalSize size;

    protected AbstractAnimal() {
        setAllAbilities();
        abilities.remove(Ability.MAKE_JOKE);
        abilities.remove(Ability.EAT_OWN_KIND);
        song = Ability.SING.getMessage();
    }

    @Override
    public String walk() {
        String message = canWalk() ? Ability.WALK.getMessage()
                : Ability.WALK.getErrorMessage();
        log(message);
        return message;
    }

    @Override
    public String fly() {
        String message = canFly() ? Ability.FLIGHT.getMessage()
                : Ability.FLIGHT.getErrorMessage();
        log(message);
        return message;
    }

    @Override
    public String sing() {
        String message = canSing() ? song : Ability.SING.getErrorMessage();
        log(message);
        return message;
    }

    @Override
    public String swim() {
        String message = canSwim() ? Ability.SWIM.getMessage()
                : Ability.SWIM.getErrorMessage();
        log(message);
        return message;
    }

    @Override
    public String makeJoke() {
        String message = canMakeJoke() ? Ability.MAKE_JOKE.getMessage()
                : Ability.MAKE_JOKE.getErrorMessage();
        log(message);
        return message;
    }

    @Override
    public String eatOwnKind() {
        String message = canEatOwnKind() ? Ability.EAT_OWN_KIND.getMessage()
                : Ability.EAT_OWN_KIND.getErrorMessage();
        log(message);
        return message;
    }

    public void log(String message) {
        System.out.println(message);
    }

    protected boolean canWalk() {
        return abilities.contains(Ability.WALK);
    }

    protected boolean canFly() {
        return abilities.contains(Ability.FLIGHT);
    }

    protected boolean canSing() {
        return abilities.contains(Ability.SING);
    }

    protected boolean canSwim() {
        return abilities.contains(Ability.SWIM);
    }

    protected boolean canMakeJoke() {
        return abilities.contains(Ability.MAKE_JOKE);
    }

    protected boolean canEatOwnKind() {
        return abilities.contains(Ability.EAT_OWN_KIND);
    }

    protected void setAllAbilities() {
        abilities = new HashSet<>();
        EnumSet.allOf(Ability.class)
                .forEach(ability -> abilities.add(ability));
    }

    protected void removeAllAbilities() {
        abilities = new HashSet<>();
    }

    /* --------
     * getters
     * --------
     */

    public Set<Ability> getAbilities() {
        return abilities;
    }

    public AnimalColor getColor() {
        return color;
    }

    public AnimalSize getSize() {
        return size;
    }
}
