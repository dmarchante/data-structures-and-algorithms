package whiteboardChallenges.linkedList;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class LinkedListTest {
    @Test
    public void testLinkList_append() {
        LinkedList libraryForTesting = new LinkedList();
        libraryForTesting.insert(3);
        libraryForTesting.insert(6);
        libraryForTesting.insert(8);
        libraryForTesting.insert(9);
        libraryForTesting.append(1);

        ArrayList<Integer> expectedList = new ArrayList<>(Arrays.asList(9, 8, 6, 3, 1));
        ArrayList<Integer> testList = libraryForTesting.printLinkedList();

        assertEquals(expectedList, testList);
    }

    @Test
    public void testLinkList_appendMultiple() {
        LinkedList libraryForTesting = new LinkedList();
        libraryForTesting.insert(3);
        libraryForTesting.insert(6);
        libraryForTesting.insert(8);
        libraryForTesting.insert(9);
        libraryForTesting.append(1);
        libraryForTesting.append(2);

        ArrayList<Integer> expectedList = new ArrayList<>(Arrays.asList(9, 8, 6, 3, 1, 2));
        ArrayList<Integer> testList = libraryForTesting.printLinkedList();

        assertEquals(expectedList, testList);
    }

    @Test
    public void testLinkList_insertBefore() {
        LinkedList libraryForTesting = new LinkedList();
        libraryForTesting.insert(3);
        libraryForTesting.insert(6);
        libraryForTesting.insert(8);
        libraryForTesting.insert(9);
        libraryForTesting.insertBefore(6, 1);

        ArrayList<Integer> expectedList = new ArrayList<>(Arrays.asList(9, 8, 1, 6, 3));
        ArrayList<Integer> testList = libraryForTesting.printLinkedList();

        assertEquals(expectedList, testList);
    }

    @Test
    public void testLinkList_insertBeforeFirst() {
        LinkedList libraryForTesting = new LinkedList();
        libraryForTesting.insert(3);
        libraryForTesting.insert(6);
        libraryForTesting.insert(8);
        libraryForTesting.insert(9);
        libraryForTesting.insertBefore(9, 1);

        ArrayList<Integer> expectedList = new ArrayList<>(Arrays.asList(1, 9, 8, 6, 3));
        ArrayList<Integer> testList = libraryForTesting.printLinkedList();

        assertEquals(expectedList, testList);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testLinkList_insertBeforeException() {
        LinkedList libraryForTesting = new LinkedList();
        libraryForTesting.insertBefore(6, 1);
    }

    @Test
    public void testLinkList_insertAfter() {
        LinkedList libraryForTesting = new LinkedList();
        libraryForTesting.insert(3);
        libraryForTesting.insert(6);
        libraryForTesting.insert(8);
        libraryForTesting.insert(9);
        libraryForTesting.insertAfter(6, 1);

        ArrayList<Integer> expectedList = new ArrayList<>(Arrays.asList(9, 8, 6, 1, 3));
        ArrayList<Integer> testList = libraryForTesting.printLinkedList();

        assertEquals(expectedList, testList);
    }

    @Test
    public void testLinkList_insertAfterLast() {
        LinkedList libraryForTesting = new LinkedList();
        libraryForTesting.insert(3);
        libraryForTesting.insert(6);
        libraryForTesting.insert(8);
        libraryForTesting.insert(9);
        libraryForTesting.insertAfter(3, 1);

        ArrayList<Integer> expectedList = new ArrayList<>(Arrays.asList(9, 8, 6, 3, 1));
        ArrayList<Integer> testList = libraryForTesting.printLinkedList();

        assertEquals(expectedList, testList);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testLinkList_insertAfterException() {
        LinkedList libraryForTesting = new LinkedList();
        libraryForTesting.insertAfter(6, 1);
    }

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
        ArrayList<Integer> testList = libraryForTesting.printLinkedList();

        assertEquals(expectedList, testList);

    }
}