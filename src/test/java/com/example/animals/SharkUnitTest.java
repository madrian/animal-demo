package com.example.animals;

import com.example.model.AnimalColor;
import com.example.model.AnimalSize;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SharkUnitTest {
    private Shark animal;

    @Before
    public void setUp() {
        animal = new Shark();
    }

    @After
    public void tearDown() {
        animal = null;
    }

    @Test
    public void testSwim() {
        assertEquals("I am swimming.", animal.swim());
    }

    @Test
    public void testEatOwnKind() {
        assertEquals("I eat my own kind.", animal.eatOwnKind());
    }

    @Test
    public void testColor() {
        assertEquals(AnimalColor.GREY, animal.getColor());
    }

    @Test
    public void testSize() {
        assertEquals(AnimalSize.LARGE, animal.getSize());
    }
}
