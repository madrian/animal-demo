package com.example.animals;

import com.example.model.AbstractAnimal;
import com.example.model.AnimalColor;
import com.example.model.AnimalSize;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClownfishUnitTest {
    private Clownfish animal;

    @Before
    public void setUp() {
        animal = new Clownfish();
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
        assertEquals("I cannot fly.", animal.fly());
    }

    @Test
    public void testSing() {
        assertEquals("I cannot sing.", animal.sing());
    }

    @Test
    public void testSwim() {
        assertEquals("I am swimming.", animal.swim());
    }

    @Test
    public void testEatOwnKind() {
        assertEquals("I don't eat my own kind.", animal.eatOwnKind());
    }

    @Test
    public void testMakeJoke() {
        assertEquals("I have a joke.", animal.makeJoke());
    }

    @Test
    public void testColor() {
        assertEquals(AnimalColor.ORANGE, animal.getColor());
    }

    @Test
    public void testSize() {
        assertEquals(AnimalSize.SMALL, animal.getSize());
    }
}
