package whiteboardChallenges.stacksandqueues;

import org.junit.Test;

import static org.junit.Assert.*;

public class QueueTest {
    Queue libraryForTesting = new Queue();

    @Test
    public void testQueue_enqueue() {
        libraryForTesting.enqueue(1);
    }

    @Test
    public void testQueue_dequeue() {
        Queue libraryForTesting = new Queue();
        libraryForTesting.enqueue(3);
        libraryForTesting.enqueue(6);
        libraryForTesting.enqueue(8);
        libraryForTesting.enqueue(9);
        libraryForTesting.dequeue();

        assertEquals(9, 9);
    }

    @Test
    public void testQueue_peek() {
        Queue libraryForTesting = new Queue();
        libraryForTesting.enqueue(3);
        libraryForTesting.enqueue(6);
        libraryForTesting.enqueue(8);
        libraryForTesting.enqueue(9);
        libraryForTesting.enqueue(10);
        int expected = libraryForTesting.peek();

        assertEquals(expected, 10);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testQueue_empty() {
        Queue libraryForTesting = new Queue();
        libraryForTesting.enqueue(3);
        libraryForTesting.enqueue(6);
        libraryForTesting.enqueue(8);
        libraryForTesting.enqueue(9);
        libraryForTesting.dequeue();
        libraryForTesting.dequeue();
        libraryForTesting.dequeue();
        Node expected = libraryForTesting.dequeue();

        assertEquals(expected.nodeValue, 3);
    }
}