package com.example.util;

import com.example.model.Ability;
import com.example.model.Animal;

import java.util.List;
import java.util.Set;

/**
 * Utility helper class on <code>Animal</code>s.
 */
public class AnimalHelper {

    public static long countFlying(List<Animal> animals) {
        return animals.stream().filter(a
                -> canFly(a.getAbilities())).count();
    }

    public static long countWalking(List<Animal> animals) {
        return animals.stream().filter(a
                -> canWalk(a.getAbilities())).count();
    }

    public static long countSinging(List<Animal> animals) {
        return animals.stream().filter(a
                -> canSing(a.getAbilities())).count();
    }

    public static long countSwimming(List<Animal> animals) {
        return animals.stream().filter(a
                -> canSwim(a.getAbilities())).count();
    }

    public static long countJoking(List<Animal> animals) {
        return animals.stream().filter(a
                -> canMakeJoke(a.getAbilities())).count();
    }
    public static long countEatingOwnKind(List<Animal> animals) {
        return animals.stream().filter(a
                -> canEatOwnKind(a.getAbilities())).count();
    }
    public static long countMorphing(List<Animal> animals) {
        return animals.stream().filter(a
                -> canMorph(a.getAbilities())).count();
    }
    public static boolean canWalk(Set<Ability> abilities) {
        return abilities.contains(Ability.WALK);
    }

    public static boolean canFly(Set<Ability> abilities) {
        return abilities.contains(Ability.FLIGHT);
    }

    public static boolean canSing(Set<Ability> abilities) {
        return abilities.contains(Ability.SING);
    }

    public static boolean canSwim(Set<Ability> abilities) {
        return abilities.contains(Ability.SWIM);
    }

    public static boolean canMakeJoke(Set<Ability> abilities) {
        return abilities.contains(Ability.MAKE_JOKE);
    }

    public static boolean canEatOwnKind(Set<Ability> abilities) {
        return abilities.contains(Ability.EAT_OWN_KIND);
    }

    public static boolean canMorph(Set<Ability> abilities) {
        return abilities.contains(Ability.MORPH);
    }

    public static void log(String message) {
        System.out.println(message);
    }

}
