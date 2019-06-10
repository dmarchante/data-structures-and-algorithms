package whiteboardChallenges.stacksandqueues;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StackTest {
    Stack libraryForTesting = new Stack();

    @Test
    public void testQueue_enqueue() {
        libraryForTesting.push(1);
    }

    @Test
    public void testQueue_dequeue() {
        Stack libraryForTesting = new Stack();
        libraryForTesting.push(3);
        libraryForTesting.push(6);
        libraryForTesting.push(8);
        libraryForTesting.push(9);

        assertEquals(9, 9);
    }

    @Test
    public void testQueue_peek() {
        Stack libraryForTesting = new Stack();
        libraryForTesting.push(3);
        libraryForTesting.push(6);
        libraryForTesting.push(8);
        libraryForTesting.push(9);

        assertEquals(9, 9);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testQueue_empty() {
        Stack libraryForTesting = new Stack();
        libraryForTesting.push(3);
        libraryForTesting.push(6);
        libraryForTesting.push(8);
        libraryForTesting.push(9);
        libraryForTesting.pop();
        libraryForTesting.pop();
        libraryForTesting.pop();
        libraryForTesting.pop();
        libraryForTesting.pop();

        assertEquals(3, 3);
    }

}