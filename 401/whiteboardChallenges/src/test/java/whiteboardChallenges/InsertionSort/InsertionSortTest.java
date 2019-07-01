package whiteboardChallenges.InsertionSort;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class InsertionSortTest {
    private InsertionSort sortClass = new InsertionSort();


    @Test
    public void testInsertionSort() {
        int[] arr = new int[] {3, 1, 7, 8, 5};
        int[] arrCheck = new int[] {1, 3, 5, 7, 8};
        int[] arrayActual = this.sortClass.insertionSort(arr);

        assertArrayEquals(arrCheck, arrayActual);
    }

    @Test
    public void testInsertionSort_sameValues() {
        int[] arrSameValues = new int[] {2, 2, 2, 2, };
        int[] arrayActual = this.sortClass.insertionSort(arrSameValues);

        assertArrayEquals(arrSameValues, arrayActual);
    }

    @Test
    public void testInsertionSort_one() {
        int[] arrOneValue = new int[] {3};
        int[] arrayActual = this.sortClass.insertionSort(arrOneValue);

        assertArrayEquals(arrOneValue, arrayActual);
    }

    @Test
    public void testInsertionSort_empty() {
        int[] arrEmpty = new int[] {};
        int[] arrayActual = this.sortClass.insertionSort(arrEmpty);

        assertArrayEquals(arrEmpty, arrayActual);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testInsertionSort_null() {
        int[] arrNull = null;
        int[] arrayActual = this.sortClass.insertionSort(arrNull);

        assertArrayEquals(arrNull, arrayActual);
    }
}