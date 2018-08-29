package com.example.animals;

import com.example.model.Animal;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BirdUnitTest {
    private Animal animal;

    @Before
    public void setUp() {
        animal = new Bird();
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
    public void testSing() {
        assertEquals("Tweet, tweet.", animal.sing());
    }
}
