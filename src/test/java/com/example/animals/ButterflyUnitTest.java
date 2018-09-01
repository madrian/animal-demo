package com.example.animals;

import com.example.model.Animal;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ButterflyUnitTest {
    private Animal animal;

    @Before
    public void setUp() {
        animal = new Butterfly();
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
        assertEquals("I am flying.", animal.fly());
    }

    @Test
    public void testSing() {
        assertEquals("I cannot sing.", animal.sing());
    }

    @Test
    public void testSwim() {
        assertEquals("I cannot swim.", animal.swim());
    }
}