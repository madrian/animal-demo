package com.example.animals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ButterflyUnitTest {
    private Butterfly animal;

    @Before
    public void setUp() {
        animal = new Butterfly();
    }

    @After
    public void tearDown() {
        animal = null;
    }

    @Test
    public void testFly() {
        assertEquals("I am flying.", animal.fly());
    }
}
