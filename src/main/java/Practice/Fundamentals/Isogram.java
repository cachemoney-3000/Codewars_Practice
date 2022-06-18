package Practice.Fundamentals;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Isogram {
    public static void main(String[] args) {
        System.out.println(isIsogram("Aermatoglyphics"));
    }
    public static boolean  isIsogram(String str) {
        str = str.toLowerCase();
        char[] arr  = str.toCharArray();
        Set<Character> set = new HashSet<>();

        for (char c : arr) {
            if (set.contains(c))
                return false;
            else
                set.add(c);
        }

        return true;
    }
}
