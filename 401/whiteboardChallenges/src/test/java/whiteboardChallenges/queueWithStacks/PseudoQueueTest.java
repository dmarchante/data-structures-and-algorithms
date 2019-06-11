package whiteboardChallenges.queueWithStacks;

import org.junit.Test;

import static org.junit.Assert.*;

public class PseudoQueueTest {
    PseudoQueue libraryForTesting = new PseudoQueue();

    @Test
    public void testQueue_enqueue() {
        PseudoQueue testStack = new PseudoQueue();
        testStack.enqueue(3);

        assertEquals(testStack.dequeue(), 3);
    }

    @Test
    public void testQueue_enqueueMultiple() {
        PseudoQueue testStack = new PseudoQueue();
        testStack.enqueue(3);
        testStack.enqueue(5);
        testStack.enqueue(7);

        assertEquals(testStack.dequeue(), 3);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testQueue_empty() {
        PseudoQueue testStack = new PseudoQueue();
        testStack.enqueue(3);
        testStack.enqueue(5);
        testStack.enqueue(7);
        testStack.dequeue();
        testStack.dequeue();
        testStack.dequeue();

        assertEquals(testStack.dequeue(), 3);
    }
}