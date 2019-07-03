package whiteboardChallenges.sort;

import java.util.*;

public class Sort {
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

    public List<Integer> mergeSort(List<Integer> arr) {
        if (arr == null) {
            throw new IllegalArgumentException("Array has no value, operation cannot be completed");
        }

        int n = arr.size();
        List<Integer> b = new ArrayList<>();
        List<Integer> c = new ArrayList<>();

        if(n > 1) {
            int mid = n / 2;

            for (int i = 0; i < mid; i++) {
                b.add(arr.get(i));
            }

            for (int i = mid; i < n; i++) {
                c.add(arr.get(i));
            }

            mergeSort(b);
            mergeSort(c);
            merge(b, c, arr);
        }

        return arr;
    }

    private List<Integer> merge(List<Integer> b, List<Integer> c, List<Integer> arr) {
        int i = 0;
        int j = 0;
        int k = 0;

        while(i < b.size() && j < c.size()) {
            if(b.get(i) <= c.get(j)) {
                arr.set(k, b.get(i));
                i++;
            } else {
                arr.set(k, c.get(j));
                j++;
            }

            k += 1;
        }

        if (i == b.size()){
            for (; j < c.size(); j++, k++) {
                arr.set(k, c.get(j));
            }
        } else {
            for (; i < b.size(); i++, k++) {
                arr.set(k, b.get(i));
            }
        }

        return arr;
    }

    public List<Integer> quickSort(List<Integer> arr, int left, int right) {
        if (arr == null) {
            throw new IllegalArgumentException("Array has no value, operation cannot be completed");
        }

        if (left < right) {
            int position = partition(arr, left, right);

            quickSort(arr, left, position - 1);
            quickSort(arr, position + 1, right);
        }

        return arr;
    }

    private int partition(List<Integer> arr, int left, int right) {
        int pivot = arr.get(right);
        int low = left - 1;

        for (int i = left; i <= right - 1; i ++) {
            if (arr.get(i) <= pivot) {
                low++;
                swap(arr, i , low);
            }
        }

        swap(arr, right, low + 1);

        return low + 1;
    }

    private void swap(List<Integer> arr, int i, int low) {
        int temp;

        temp = arr.get(i);
        arr.set(i, arr.get(low));
        arr.set(low, temp);
    }

    public Sort() {}
}
