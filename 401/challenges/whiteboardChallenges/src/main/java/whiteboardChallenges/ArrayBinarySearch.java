package whiteboardChallenges;

public class ArrayBinarySearch {
    public static int binarySearch(int[] array, int num) {
        int indexStart = 0;
        int indexEnd = array.length -1;

        while (indexStart <= indexEnd) {
            int indexMiddle = ((indexStart + indexEnd) / 2);

            if (num == array[indexMiddle]) {
                return indexMiddle;
            } else if (num < array[indexMiddle]) {
                indexEnd = indexMiddle;
            } else {
                indexStart = indexMiddle + 1;
            }
        }
        return -1;
    }
}
