package com.example.animals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ChickenUnitTest {
    private Chicken animal;

    @Before
    public void setUp() {
        animal = new Chicken();
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
    public void testSing() {
        assertEquals("Cluck, cluck.", animal.sing());
    }
}
