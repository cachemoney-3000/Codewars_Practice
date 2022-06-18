package Practice.Challenge;

import java.util.Arrays;
import java.util.Locale;

public class DirReduction {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(dirReduc(new String[]{"NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST"})));
        System.out.println(Arrays.toString(dirReduc(new String[]{"NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH"})));
    }
    public static String[] dirReduc(String[] arr) {
        if (arr == null || arr.length <= 1) {
            return arr;
        }

        for (int i = 0; i < arr.length - 1; i++) {
            if (("NORTH".equals(arr[i]) && "SOUTH".equals(arr[i + 1])) ||
                    ("SOUTH".equals(arr[i]) && "NORTH".equals(arr[i + 1])) ||
                    ("EAST".equals(arr[i]) && "WEST".equals(arr[i + 1])) ||
                    ("WEST".equals(arr[i]) && "EAST".equals(arr[i + 1]))) {
                arr[i] = null;
                arr[i + 1] = null;
            }
        }
        final String[] newArr = Arrays.stream(arr)
                .filter(s -> s != null)
                .toArray(String[]::new);

        if (newArr.length == arr.length) {
            return arr;
        } else {
            return dirReduc(newArr);
        }
    }
}
