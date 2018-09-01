package com.example.animals;

import com.example.model.Animal;
import com.example.model.ParrotType;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CockyParrotUnitTest {
    private Animal animal;

    @Before
    public void setUp() {
        animal = new Parrot(ParrotType.COCKY_PARROT);
    }

    @After
    public void tearDown() {
        animal = null;
    }

    @Test
    public void testWalk() {
        assertEquals("I am walking.", animal.walk());
    }

    @Test
    public void testFly() {
        assertEquals("I am flying.", animal.fly());
    }

    @Test
    public void testSwim() {
        assertEquals("I cannot swim.", animal.swim());
    }

    @Test
    public void testSing() {
        assertEquals("Cock-a-doodle-doo.", animal.sing());
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
