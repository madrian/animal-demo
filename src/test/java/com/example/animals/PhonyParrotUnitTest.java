package com.example.animals;

import com.example.model.ParrotType;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PhonyParrotUnitTest {
    private Parrot animal;

    @Before
    public void setUp() {
        animal = new Parrot(ParrotType.PHONY_PARROT);
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
        assertEquals("Riiiiing, riiiiing.", animal.sing());
    }
}
