package com.example.animals;

import com.example.model.Animal;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Locale;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class RoosterUnitTest {
    private Animal animal;

    @Before
    public void setUp() {
        animal = new Rooster();
    }

    @After
    public void tearDown() {
        animal = null;
        Locale.setDefault(new Locale("en", "US"));
    }

    @Test
    public void testWalk() {
        assertEquals("I am walking.", animal.walk());
    }

    @Test
    public void testFly() {
        assertEquals("I cannot fly.", animal.fly());
    }

    @Test
    public void testSing() {
        assertEquals("Cock-a-doodle-doo.", animal.sing());
    }

    @Test
    public void testSingLocaleEnPh() {
        Locale.setDefault(new Locale("en", "PH"));
        animal = new Rooster();
        assertEquals("Tik-ti-la-ok.", animal.sing());
    }

    @Test
    public void testSwim() {
        assertEquals("I cannot swim.", animal.swim());
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
