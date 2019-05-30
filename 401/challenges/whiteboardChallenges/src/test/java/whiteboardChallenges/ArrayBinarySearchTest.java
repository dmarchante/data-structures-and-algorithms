package whiteboardChallenges;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArrayBinarySearchTest {
    @Test
    public void testCalculateAverageMethod() {
        int[] array = {1, 2, 3, 4, 5};
        int index = ArrayBinarySearch.binarySearch(array, 6);
        assertEquals(index, -1);
    }
}
