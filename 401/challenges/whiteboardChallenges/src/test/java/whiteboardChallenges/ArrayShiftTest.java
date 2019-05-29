package whiteboardChallenges;

import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayShiftTest {
    @Test
    public void testShiftEven_expectedArray() {
        ArrayShift libraryForTesting = new ArrayShift();
        int[] inputArray = new int[]{1, 2, 4, 5};
        int num = 3;

        int[] expectedOutput = new int[]{1, 2, 3, 4, 5};
        assertArrayEquals("should shift array.",
                expectedOutput,
                libraryForTesting.insertShiftArray(inputArray, num));
    }

    @Test
    public void testShiftOdd_expectedArray() {
        ArrayShift libraryForTesting = new ArrayShift();
        int[] inputArray = new int[]{1, 2, 3, 5, 6};
        int num = 4;

        int[] expectedOutput = new int[]{1, 2, 3, 4, 5, 6};
        assertArrayEquals("should shift array.",
                expectedOutput,
                libraryForTesting.insertShiftArray(inputArray, num));
    }

    // Test for empty array
}
