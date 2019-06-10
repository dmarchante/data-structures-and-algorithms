package whiteboardChallenges.linkedList;

import org.junit.Before;
import org.junit.Test;
import sun.awt.image.ImageWatched;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class LinkedListTest {
    LinkedList libraryForTesting = new LinkedList();

    @Before
    public void setUp () {
        libraryForTesting = new LinkedList();
        libraryForTesting.insert(3);
        libraryForTesting.insert(6);
        libraryForTesting.insert(8);
        libraryForTesting.insert(9);
    }

    @Test
    public void testLinkList_append() {
        libraryForTesting.append(1);

        ArrayList<Integer> expectedList = new ArrayList<>(Arrays.asList(9, 8, 6, 3, 1));
        ArrayList<Integer> testList = libraryForTesting.printLinkedList();

        assertEquals(expectedList, testList);
    }

    @Test
    public void testLinkList_appendMultiple() {
        libraryForTesting.append(1);
        libraryForTesting.append(2);

        ArrayList<Integer> expectedList = new ArrayList<>(Arrays.asList(9, 8, 6, 3, 1, 2));
        ArrayList<Integer> testList = libraryForTesting.printLinkedList();

        assertEquals(expectedList, testList);
    }

    @Test
    public void testLinkList_insertBefore() {
        libraryForTesting.insertBefore(6, 1);

        ArrayList<Integer> expectedList = new ArrayList<>(Arrays.asList(9, 8, 1, 6, 3));
        ArrayList<Integer> testList = libraryForTesting.printLinkedList();

        assertEquals(expectedList, testList);
    }

    @Test
    public void testLinkList_insertBeforeFirst() {
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
        libraryForTesting.insertAfter(6, 1);

        ArrayList<Integer> expectedList = new ArrayList<>(Arrays.asList(9, 8, 6, 1, 3));
        ArrayList<Integer> testList = libraryForTesting.printLinkedList();

        assertEquals(expectedList, testList);
    }

    @Test
    public void testLinkList_insertAfterLast() {
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
    public void testLinkedList_valueAtIndex() {
        int testValue = libraryForTesting.valueAtNthFromEnd(2);

        assertEquals(8, testValue);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testLinkList_valueAtIndexEmptyException() {
        LinkedList libraryForTesting = new LinkedList();
        libraryForTesting.valueAtNthFromEnd(1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testLinkList_valueAtIndexHighException() {
        LinkedList libraryForTesting = new LinkedList();
        libraryForTesting.insert(3);
        libraryForTesting.insert(6);
        libraryForTesting.insert(8);
        libraryForTesting.insert(9);
        libraryForTesting.valueAtNthFromEnd(8);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testLinkList_valueAtIndexLowException() {
        LinkedList libraryForTesting = new LinkedList();
        libraryForTesting.insert(3);
        libraryForTesting.insert(6);
        libraryForTesting.insert(8);
        libraryForTesting.insert(9);
        libraryForTesting.valueAtNthFromEnd(-1);
    }

    @Test
    public void testLinkList_insertFalse() {
        boolean testBoolean = libraryForTesting.includes(4);

        assertFalse(testBoolean);
    }

    @Test
    public void testLinkList_insertTrue() {
        boolean testBoolean = libraryForTesting.includes(3);

        assertTrue(testBoolean);
    }

    @Test
    public void testLinkList_merge() {
        LinkedList listForTesting = new LinkedList();
        LinkedList expectedList = new LinkedList();
        LinkedList one = new LinkedList();
        LinkedList two = new LinkedList();

        expectedList.insert(3);
        expectedList.insert(6);
        expectedList.insert(8);
        expectedList.insert(9);

        one.insert(9);
        one.insert(6);

        two.insert(8);
        two.insert(3);

        LinkedList testList = listForTesting.mergeLists(one, two);

        ArrayList testListPrint = testList.printLinkedList();
        ArrayList expectedListPrint = expectedList.printLinkedList();

        assertEquals(expectedListPrint, testListPrint);
    }

    @Test
    public void testLinkList_print() {
        ArrayList<Integer> expectedList = new ArrayList<>(Arrays.asList(9, 8, 6, 3));
        ArrayList<Integer> testList = libraryForTesting.printLinkedList();

        assertEquals(expectedList, testList);

    }
}