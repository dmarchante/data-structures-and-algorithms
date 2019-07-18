package whiteboardChallenges.sort;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class SortTest {
    private Sort sortClass = new Sort();
    List<Integer> arr = new ArrayList<>();
    List<Integer> arrCheck = new ArrayList<>();

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

    @Test
    public void testMergeSort() {
        this.arr.add(9);
        this.arr.add(7);
        this.arr.add(6);
        this.arr.add(5);
        this.arr.add(8);
        this.arr.add(4);

        this.arrCheck.add(4);
        this.arrCheck.add(5);
        this.arrCheck.add(6);
        this.arrCheck.add(7);
        this.arrCheck.add(8);
        this.arrCheck.add(9);

        List<Integer> arrayActual = this.sortClass.mergeSort(this.arr);

        assertEquals(this.arrCheck, arrayActual);
    }

    @Test
    public void testMergeSort_sameValues() {
        this.arr.add(5);
        this.arr.add(5);
        this.arr.add(5);
        this.arr.add(5);

        this.arrCheck.add(5);
        this.arrCheck.add(5);
        this.arrCheck.add(5);
        this.arrCheck.add(5);

        List<Integer> arrayActual = this.sortClass.mergeSort(this.arr);

        assertEquals(this.arrCheck, arrayActual);
    }

    @Test
    public void testMergeSort_one() {
        this.arr.add(5);
        this.arrCheck.add(5);

        List<Integer> arrayActual = this.sortClass.mergeSort(this.arr);

        assertEquals(this.arrCheck, arrayActual);
    }

    @Test
    public void testMergeSort_empty() {
        List<Integer> arrayActual = this.sortClass.mergeSort(this.arr);

        assertEquals(this.arr, arrayActual);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testMergeSort_null() {
        this.arr = null;
        List<Integer> arrayActual = this.sortClass.mergeSort(this.arr);

        assertEquals(this.arr, arrayActual);
    }

    @Test
    public void testQuickSort() {
        this.arr.add(9);
        this.arr.add(7);
        this.arr.add(6);
        this.arr.add(5);
        this.arr.add(8);
        this.arr.add(4);

        this.arrCheck.add(4);
        this.arrCheck.add(5);
        this.arrCheck.add(6);
        this.arrCheck.add(7);
        this.arrCheck.add(8);
        this.arrCheck.add(9);

        List<Integer> arrayActual = this.sortClass.quickSort(this.arr, 0, this.arr.size() - 1);

        assertEquals(this.arrCheck, arrayActual);
    }

    @Test
    public void testQuickSort_sameValues() {
        this.arr.add(5);
        this.arr.add(5);
        this.arr.add(5);
        this.arr.add(5);

        this.arrCheck.add(5);
        this.arrCheck.add(5);
        this.arrCheck.add(5);
        this.arrCheck.add(5);

        List<Integer> arrayActual = this.sortClass.quickSort(this.arr, 0, this.arr.size() - 1);

        assertEquals(this.arrCheck, arrayActual);
    }

    @Test
    public void testQuickSort_one() {
        this.arr.add(5);
        this.arrCheck.add(5);

        List<Integer> arrayActual = this.sortClass.quickSort(this.arr, 0, this.arr.size() - 1);

        assertEquals(this.arrCheck, arrayActual);
    }

    @Test
    public void testQuickSort_empty() {
        List<Integer> arrayActual = this.sortClass.quickSort(this.arr, 0, this.arr.size() - 1);

        assertEquals(this.arr, arrayActual);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testQuickSort_null() {
        this.arr = null;
        List<Integer> arrayActual = this.sortClass.quickSort(this.arr, 0, 0);

        assertEquals(this.arr, arrayActual);
    }
}