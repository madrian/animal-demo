package com.example.util;

import com.example.animals.*;
import com.example.model.Animal;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static com.example.util.AnimalHelper.*;
import static org.junit.Assert.assertEquals;

public class AnimalHelperUnitTest {
    private List<Animal> animals;

    @Before
    public void setUp() {
        animals = Arrays.asList(
                new Bird(),
                new Butterfly(),
                new Cat(),
                new Caterpillar(),
                new Chicken(),
                new Clownfish(),
                new Dog(),
                new Dolphin(),
                new Duck(),
                new Fish(),
                new FlyingBird(),
                new Parrot(new Dog()),
                new Rooster(),
                new Shark()
        );
    }

    @After
    public void tearDown() {
        animals = null;
    }

    @Test
    public void testCountFlying() {
        assertEquals(4, countFlying(animals));
    }

    @Test
    public void testCountWalking() {
        assertEquals(9, countWalking(animals));
    }

    @Test
    public void testCountSinging() {
        assertEquals(8, countSinging(animals));
    }

    @Test
    public void testCountSwimming() {
        assertEquals(7, countSwimming(animals));
    }

    @Test
    public void testCountJoking() {
        assertEquals(1, countJoking(animals));
    }

    @Test
    public void testCountEatingOwnKind() {
        assertEquals(1, countEatingOwnKind(animals));
    }

    @Test
    public void testCountMorphing() {
        assertEquals(1, countMorphing(animals));
    }
}
