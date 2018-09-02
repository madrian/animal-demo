package com.example.animals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Locale;

import static org.junit.Assert.assertEquals;

public class RoosterUnitTest {
    private Rooster animal;

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
    public void testSing() {
        assertEquals("Cock-a-doodle-doo.", animal.sing());
    }

    @Test
    public void testSingLocaleEnPh() {
        Locale.setDefault(new Locale("en", "PH"));
        animal = new Rooster();
        assertEquals("Tik-ti-la-ok.", animal.sing());
    }
}
