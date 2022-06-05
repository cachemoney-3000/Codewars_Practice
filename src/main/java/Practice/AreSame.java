package Practice;

import java.util.Arrays;

public class AreSame {
    public static void main(String[] args) {
        int[] a = new int[]{121, -144, 19, 161, 19, 144, 19, 11};
        int[] b = new int[]{121, 14641, 20736, 361, 25921, 361, 20736, 361};
        comp(a, b);
    }
    public static boolean comp(int[] a, int[] b) {
        if (a.length == 0 || b.length == 0) return false;
        if (a.length != b.length) return false;

        int[] sortedA = Arrays.stream(a).map(x -> x * x).sorted().toArray();
        int[] sortedB = Arrays.stream(b).sorted().toArray();
        return Arrays.equals(sortedA, sortedB);
    }
}
