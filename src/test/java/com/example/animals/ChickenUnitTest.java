package com.example.animals;

import com.example.model.Animal;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ChickenUnitTest {
    private Animal animal;

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
    public void testFly() {
        assertEquals("I cannot fly.", animal.fly());
    }

    @Test
    public void testSing() {
        assertEquals("Cluck, cluck.", animal.sing());
    }

    @Test
    public void testSwim() {
        assertEquals("I cannot swim.", animal.swim());
    }
}
