package com.example.animals;

import com.example.model.Animal;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoosterUnitTest {
    private Animal animal;

    @Before
    public void setUp() {
        animal = new Rooster();
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
        assertEquals("I cannot fly.", animal.fly());
    }

    @Test
    public void testSing() {
        assertEquals("Cock-a-doodle-doo.", animal.sing());
    }

    @Test
    public void testSwim() {
        assertEquals("I am swimming.", animal.swim());
    }
}
