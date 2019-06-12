package whiteboardChallenges.fifoAnimalShelter;

import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalShelterTest {
    @Test
    public void testAnimalQueue_dog() {
        AnimalShelter testStack = new AnimalShelter<>();
        testStack.enqueue("dog");
        testStack.enqueue("cat");
        testStack.enqueue("cat");
        testStack.enqueue("cat");

        assertEquals(testStack.dequeue("dog"), "dog");
    }

    @Test
    public void testAnimalQueue_cat() {
        AnimalShelter testStack = new AnimalShelter<>();
        testStack.enqueue("dog");
        testStack.enqueue("dog");
        testStack.enqueue("cat");
        testStack.enqueue("dog");
        testStack.enqueue("dog");

        assertEquals(testStack.dequeue("cat"), "cat");
    }

    @Test
    public void testAnimalQueue_oldest() {
        AnimalShelter testStack = new AnimalShelter<>();
        testStack.enqueue("cat");
        testStack.enqueue("dog");
        testStack.enqueue("dog");
        testStack.enqueue("dog");
        testStack.enqueue("dog");

        assertEquals(testStack.dequeue("none"), "cat");
    }

    @Test
    public void testAnimalQueue_null() {
        AnimalShelter testStack = new AnimalShelter<>();
        testStack.enqueue("dog");
        testStack.enqueue("cat");

        assertEquals(testStack.dequeue("fish"), null);
    }

    @Test
    public void testAnimalQueue_int() {
        AnimalShelter testStack = new AnimalShelter<>();
        testStack.enqueue("dog");
        testStack.enqueue("cat");

        assertEquals(testStack.dequeue(3), null);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testQueue_empty() {
        AnimalShelter testStack = new AnimalShelter();

        assertEquals(testStack.dequeue("dog"), "dog");
    }
}