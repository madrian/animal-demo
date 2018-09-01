package com.example.animals;

import com.example.model.Animal;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class DolphinUnitTest {
    private Animal animal;

    @Before
    public void setUp() {
        animal = new Dolphin();
    }

    @After
    public void tearDown() {
        animal = null;
    }

    @Test
    public void testWalk() {
        assertEquals("I cannot walk.", animal.walk());
    }

    @Test
    public void testFly() {
        assertEquals("I cannot fly.", animal.fly());
    }

    @Test
    public void testSing() {
        assertEquals("I cannot sing.", animal.sing());
    }

    @Test
    public void testSwim() {
        assertEquals("I am swimming.", animal.swim());
    }

    @Test
    public void testEatOwnKind() {
        assertEquals("I don't eat my own kind.", animal.eatOwnKind());
    }

    @Test
    public void testMakeJoke() {
        assertEquals("I don't have a joke.", animal.makeJoke());
    }

    @Test
    public void testMorph() {
        Animal morphedAnimal = animal.morph();
        assertTrue(morphedAnimal == animal);
    }
}
