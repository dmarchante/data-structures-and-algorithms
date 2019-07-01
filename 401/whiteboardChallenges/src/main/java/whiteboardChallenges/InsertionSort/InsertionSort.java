package whiteboardChallenges.InsertionSort;

public class InsertionSort {
    public int[] insertionSort(int[] arr) {
        if (arr == null) {
            throw new IllegalArgumentException("Array has no value, operation cannot be completed");
        }

        if (arr.length == 1 || arr.length == 0) {
            return arr;
        }

        for(int i = 1; i < arr.length; i++) {
            int j = i - 1;
            int temp = arr[i];

            while (j >= 0 && temp < arr[j]) {
                arr[j + 1] = arr[j];
                j = j -1;
            }

            arr[j + 1] = temp;
        }

        return arr;
    }

    public InsertionSort() {}
}
