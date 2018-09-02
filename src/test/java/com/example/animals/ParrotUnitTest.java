package com.example.animals;

import com.example.model.Animal;
import com.example.object.Phone;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ParrotUnitTest {
    private Animal animal;

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
        animal = null;
    }

    @Test
    public void testWalk() {
        animal = new Parrot();
        assertEquals("I am walking.", animal.walk());
    }

    @Test
    public void testFly() {
        animal = new Parrot();
        assertEquals("I am flying.", animal.fly());
    }

    @Test
    public void testSing() {
        animal = new Parrot();
        assertEquals("Tweet, tweet.", animal.sing());
    }

    @Test
    public void testSwim() {
        animal = new Parrot();
        assertEquals("I cannot swim.", animal.swim());
    }

    @Test
    public void testEatOwnKind() {
        animal = new Parrot();
        assertEquals("I don't eat my own kind.", animal.eatOwnKind());
    }

    @Test
    public void testMakeJoke() {
        animal = new Parrot();
        assertEquals("I don't have a joke.", animal.makeJoke());
    }

    @Test
    public void testMorph() {
        animal = new Parrot();
        Animal morphedAnimal = animal.morph();
        assertTrue(morphedAnimal == animal);
    }

    @Test
    public void testSingWithRooster() {
        animal = new Parrot(new Rooster());
        assertEquals("Cock-a-doodle-doo.", animal.sing());
    }

    @Test
    public void testSingWithDuck() {
        animal = new Parrot(new Duck());
        assertEquals("Quack, quack.", animal.sing());
    }

    @Test
    public void testSingWithDog() {
        animal = new Parrot(new Dog());
        assertEquals("Woof, woof.", animal.sing());
    }

    @Test
    public void testSingWithCat() {
        animal = new Parrot(new Cat());
        assertEquals("Meow.", animal.sing());
    }

    @Test
    public void testSingWithPhone() {
        animal = new Parrot(new Phone());
        assertEquals("Riiiiing, riiiiing.", animal.sing());
    }
}
