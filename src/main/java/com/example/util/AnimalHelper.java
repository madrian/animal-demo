package com.example.util;

import com.example.model.*;

import java.util.List;

/**
 * Utility helper class on <code>Animal</code>s.
 */
public class AnimalHelper {

    public static long countFlying(List<Animal> animals) {
        return animals.stream().filter(a
                -> a instanceof FlyAbility).count();
    }

    public static long countWalking(List<Animal> animals) {
        return animals.stream().filter(a
                -> a instanceof WalkAbility).count();
    }

    public static long countSinging(List<Animal> animals) {
        return animals.stream().filter(a
                -> a instanceof SingAbility).count();
    }

    public static long countSwimming(List<Animal> animals) {
        return animals.stream().filter(a
                -> a instanceof SwimAbility).count();
    }

    public static long countJoking(List<Animal> animals) {
        return animals.stream().filter(a
                -> a instanceof MakeJokeAbility).count();
    }
    public static long countEatingOwnKind(List<Animal> animals) {
        return animals.stream().filter(a
                -> a instanceof EatOwnKindAbility).count();
    }
    public static long countMorphing(List<Animal> animals) {
        return animals.stream().filter(a
                -> a instanceof MorphAbility).count();
    }

    public static void log(String message) {
        System.out.println(message);
    }

    public static String executeAbility(AbilityMessage abilityMessage,
                                    String customMessage) {
        String s = customMessage == null || customMessage.length() == 0 ?
                abilityMessage.getMessage() : customMessage;
        log(s);
        return s;
    }

    public static String executeAbility(AbilityMessage abilityMessage) {
        return executeAbility(abilityMessage, null);
    }
}
