package whiteboardChallenges;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArrayBinarySearchTest {
    @Test
    public void testBinarySearch_error() {
        int[] array = {1, 2, 3, 4, 5};
        int index = ArrayBinarySearch.binarySearch(array, 6);
        assertEquals(index, -1);
    }

    @Test
    public void testCalculateAverageMethod_expected() {
        int[] array = {1, 2, 3, 4, 5};
        int index = ArrayBinarySearch.binarySearch(array, 5);
        assertEquals(index, 4);
    }

    @Test
    public void testCalculateAverageMethod_expectedEmpty() {
        int[] array = {};
        int index = ArrayBinarySearch.binarySearch(array, 5);
        assertEquals(index, -1);
    }
}
