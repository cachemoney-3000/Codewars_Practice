package Practice.kyu6;

import java.util.HashMap;

public class CountingDuplicates {
    public static void main(String[] args) {
        System.out.println(duplicateCount("abcdeaa"));
    }
    public static int duplicateCount(String text) {
        HashMap<Character, Integer> map = new HashMap<>();
        text = text.toLowerCase();
        char[] charArr = text.toCharArray();

        for (char c : charArr) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 0);
            }
        }
        map.values().removeIf(f -> f == 0);


        return map.size();
    }
}
