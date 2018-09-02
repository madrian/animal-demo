package com.example.animals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DolphinUnitTest {
    private Dolphin animal;

    @Before
    public void setUp() {
        animal = new Dolphin();
    }

    @After
    public void tearDown() {
        animal = null;
    }

    @Test
    public void testSwim() {
        assertEquals("I am swimming.", animal.swim());
    }

}
