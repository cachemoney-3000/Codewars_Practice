package Practice.Challenge;

import java.util.Arrays;

public class FindMissing {
    public static void main(String[] args) {
        System.out.println(findMissing(new int[] {1,1,1}));
    }
    public static int findMissing(int[] numbers)
    {
        int[] diff = new int[numbers.length];
        diff[0] = 0;
        int maxAt = 0;
        // Sort the numbers in increasing order
        Arrays.sort(numbers);

        for (int i = 1; i < numbers.length; i++){
            // Store the difference
            diff[i] = numbers[i] - numbers[i - 1];
            // Find the index of the highest difference
            maxAt = diff[i] > diff[maxAt] ? i : maxAt;
        }

        // All numbers in the array are the same
        if (maxAt == 0) return numbers[0];
        // If highest difference is at index 1
        else if (maxAt == 1) return numbers[maxAt - 1] + diff[maxAt + 1];

        return numbers[maxAt - 1] + diff[maxAt - 1];
    }
}
