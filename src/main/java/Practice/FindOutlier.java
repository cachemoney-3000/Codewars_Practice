package Practice;

public class FindOutlier {
    public static void main(String[] args) {
        System.out.println(find(new int[]{2,6,8,-10,3}));
        System.out.println(find(new int[]{206847684,1056521,7,17,1901,21104421,7,1,35521,1,7781}));
        System.out.println(find(new int[]{Integer.MAX_VALUE, 0, 1}));
    }

    static int find(int[] integers) {
        int evenCount = 0;
        int oddCount = 0;
        int firstEven = 0;
        int firstOdd = 0;

        for (int i = 0; i < integers.length; i++) {
            // Check if a number is even
            if (integers[i] % 2 == 0) {
                evenCount++;    // Increase the even counter
                firstEven = integers[i];    // Update the first instance of an even number

                // At the index 2, check if we found 2 even and 1 odd
                if (evenCount == 2 && oddCount == 1 && i == 2) {
                    return firstOdd;    // Return the first occurrence of the odd number
                }
                // Return the first occurrence of an even number
                else if (oddCount > 0 && i > 2)
                    return integers[i];
            }
            else {
                oddCount++;     // Increase the odd counter
                firstOdd = integers[i];     // Update thr first instance of an odd number
                // At the index 2, check if we found 2 odd and 1 even
                if (evenCount == 1 && oddCount == 2 && i == 2) {
                    return firstEven;   // Return the first occurrence of the odd number
                }
                // Return the first occurrence of an odd number
                else if (evenCount > 0 && i > 2)
                    return integers[i];
            }
        }
        // If we reach here, then no solution found
        return -999999;
    }
}
