package Practice.Fundamentals;

import java.util.Arrays;

public class SortOdd {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortArray(new int[]{5, 3, 2, 8, 1, 4})));

    }
    // Sort odd numbers in the array using insertion sort
    public static int[] sortArray(int[] array) {
        int n = array.length;
        for (int i = 0; i < n; i++) {
            // Find the minimum element in unsorted array
            if (array[i] % 2 != 0) {
                int min_idx = i;
                for (int j = i+1; j < n; j++)
                    if (array[j] % 2 != 0 && array[j] < array[min_idx])
                        min_idx = j;

                // Swap the found minimum element with the first
                // element
                int temp = array[min_idx];
                array[min_idx] = array[i];
                array[i] = temp;
            }
        }
        return array;
    }
}
