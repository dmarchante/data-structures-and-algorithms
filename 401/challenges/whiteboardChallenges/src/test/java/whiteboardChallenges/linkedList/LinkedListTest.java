package whiteboardChallenges.linkedList;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class LinkedListTest {
    @Test
    public void testLinkList_insertFalse() {
        LinkedList libraryForTesting = new LinkedList();
        libraryForTesting.insert(3);
        libraryForTesting.insert(6);
        libraryForTesting.insert(8);
        libraryForTesting.insert(9);

        boolean testBoolean = libraryForTesting.includes(4);

        assertFalse(testBoolean);
    }

    @Test
    public void testLinkList_insertTrue() {
        LinkedList libraryForTesting = new LinkedList();
        libraryForTesting.insert(3);
        libraryForTesting.insert(6);
        libraryForTesting.insert(8);
        libraryForTesting.insert(9);

        boolean testBoolean = libraryForTesting.includes(3);

        assertTrue(testBoolean);
    }

    @Test
    public void testLinkList_print() {
        LinkedList libraryForTesting = new LinkedList();
        libraryForTesting.insert(3);
        libraryForTesting.insert(6);
        libraryForTesting.insert(8);
        libraryForTesting.insert(9);

        ArrayList<Integer> expectedList = new ArrayList<>(Arrays.asList(9, 8, 6, 3));
        ArrayList<Integer> testList = libraryForTesting.print();

//        assertEquals("something", new ArrayList<Integer>(Arrays.asList(9, 8, 6, 3)), libraryForTesting.print());
        assertEquals(expectedList, testList);

    }
}