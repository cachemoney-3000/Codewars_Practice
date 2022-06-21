package Practice.kyu5;

import java.util.Arrays;

public class MaxSubArray {
    public static void main(String[] args) {
        System.out.println(sequence(new int[]{-2, -1, -3, -4, -1, -2, -1, -5, -4}));
    }
    public static int sequence(int[] arr) {
        if (arr.length == 0) return 0;
        System.out.println(Arrays.toString(arr));

        // Using Kadane's Algorithm
        int maxCur = arr[0];
        int maxLocal = maxCur;
        int maxGlobal = maxLocal;

        for (int i = 1; i < arr.length; i++) {
            maxLocal = arr[i] + maxLocal;
            maxCur = arr[i];

            maxLocal = Math.max(maxCur, maxLocal);
            maxGlobal = Math.max(maxGlobal, maxLocal);

        }
        return Math.max(maxGlobal, 0);
    }
}
