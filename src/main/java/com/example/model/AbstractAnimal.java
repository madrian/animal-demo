package com.example.model;

import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;

import static com.example.util.AnimalHelper.*;

/**
 * Abstract base class of the <code>Animal</code> interface.
 */
public abstract class AbstractAnimal implements Animal {
    protected Set<Ability> abilities = new HashSet<>();
    protected String song;
    protected AnimalColor color;
    protected AnimalSize size;

    protected AbstractAnimal() {
        //default abilities
        setAllAbilities();
        abilities.remove(Ability.MAKE_JOKE);
        abilities.remove(Ability.EAT_OWN_KIND);
        abilities.remove(Ability.MORPH);

        song = Ability.SING.getMessage();
    }

    @Override
    public String walk() {
        String message = canWalk(abilities)
                ? Ability.WALK.getMessage() : Ability.WALK.getErrorMessage();
        log(message);
        return message;
    }

    @Override
    public String fly() {
        String message = canFly(abilities)
                ? Ability.FLIGHT.getMessage(): Ability.FLIGHT.getErrorMessage();
        log(message);
        return message;
    }

    @Override
    public String sing() {
        String message = canSing(abilities)
                ? song : Ability.SING.getErrorMessage();
        log(message);
        return message;
    }

    @Override
    public String swim() {
        String message = canSwim(abilities)
                ? Ability.SWIM.getMessage() : Ability.SWIM.getErrorMessage();
        log(message);
        return message;
    }

    @Override
    public String makeJoke() {
        String message = canMakeJoke(abilities)
                ? Ability.MAKE_JOKE.getMessage()
                : Ability.MAKE_JOKE.getErrorMessage();
        log(message);
        return message;
    }

    @Override
    public String eatOwnKind() {
        String message = canEatOwnKind(abilities)
                ? Ability.EAT_OWN_KIND.getMessage()
                : Ability.EAT_OWN_KIND.getErrorMessage();
        log(message);
        return message;
    }

    @Override
    public Animal morph() {
        String message = canMorph(abilities)
                ? Ability.MORPH.getMessage() : Ability.MORPH.getErrorMessage();
        log(message);

        return getMorphedAnimal();
    }

    /**
     * Animals that have <code>Ability.MORPH</code> can override this method
     * to get the new morphed Animal.
     *
     * <p>
     *     For example, a <code>Caterpillar</code> can morph to a
     *     <code>Butterfly</code> and should override this to return
     *     a butterfly instance.
     * </p>
     * @return the morphed animal; defaults to itself if not overridden.
     */
    protected Animal getMorphedAnimal() {
        return this;
    }

    public void log(String message) {
        System.out.println(message);
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

    @Override
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
