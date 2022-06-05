package Practice;

import java.util.*;

public class ArrayDiff {
    public static void main(String[] args) {
        //System.out.println(Arrays.toString(arrayDiff(new int[]{1, 2, 2, 3, 4, 5, 6}, new int[]{9})));
        System.out.println(Arrays.toString(arrayDiff(new int[]{1, 2}, new int[]{1})));
        System.out.println(Arrays.toString(arrayDiff(new int[]{1, 2, 2}, new int[]{1})));
        System.out.println(Arrays.toString(arrayDiff(new int[]{1, 2, 2}, new int[]{2})));
        System.out.println(Arrays.toString(arrayDiff(new int[]{1, 2, 2}, new int[]{})));
        System.out.println(Arrays.toString(arrayDiff(new int[]{}, new int[]{1, 2})));


    }

    public static int[] arrayDiff(int[] a, int[] b) {
        List<Integer> list = new ArrayList<>();

        for (int j : a)
            list.add(j);

        for (int i : b)
            list.removeAll(Collections.singleton(i));

        Integer[] res = new Integer[list.size()];
        System.arraycopy(list.toArray(), 0, res, 0, list.size());
        return Arrays.stream(res).mapToInt(Integer::intValue).toArray();
    }

}
