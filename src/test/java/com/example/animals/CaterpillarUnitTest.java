package com.example.animals;

import com.example.model.Animal;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CaterpillarUnitTest {
    private Caterpillar animal;

    @Before
    public void setUp() {
        animal = new Caterpillar();
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
    public void testMorph() {
        Animal morphedAnimal = animal.morph();
        assertTrue(morphedAnimal instanceof Butterfly);
    }
}
