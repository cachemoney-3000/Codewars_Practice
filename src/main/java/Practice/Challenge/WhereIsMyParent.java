package Practice.Challenge;

import java.util.Arrays;
import java.util.HashMap;
import java.util.TreeMap;

public class WhereIsMyParent {
    public static void main(String[] args) {
        //System.out.println(findChildren("xXfuUuuF"));
        System.out.println(findChildren2("xXfuUuuF"));
    }
    static String findChildren(final String text) {
        if (text.equals("")) return "";

        char[] textArr = text.toCharArray();
        HashMap<Character, String> parents = new HashMap<>();
        TreeMap<Character, String> tree = new TreeMap<>(parents);

        for (char c : textArr) {
            boolean uppercase = Character.isUpperCase(c);

            if (!uppercase && !parents.containsKey(Character.toUpperCase(c))) {
                parents.put(Character.toUpperCase(c), Character.toString(c));
            }
            else if (uppercase && !parents.containsKey(c)) {
                parents.put(c, "");
            }
            else if (!uppercase && parents.containsKey(Character.toUpperCase(c))){
                parents.put(Character.toUpperCase(c), parents.get(Character.toUpperCase(c)) + c);
            }
        }

        tree.putAll(parents);
        int size = tree.size();
        System.out.println(tree);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            Character key = tree.firstKey();
            sb.append(key).append(tree.get(key));
            tree.remove(key);
        }

        return sb.toString();
    }

    static String findChildren2(final String text) {
        String[] arr = text.split("");
        // Sort by ASCII numbers, uppercase letter will be in front
        Arrays.sort(arr);

        HashMap<String, String> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int val = arr[i].charAt(0);

            if (val >= 65 && val <= 90) {
                map.put(arr[i], arr[i]);
            }
            else {
                map.put(arr[i].toUpperCase(), map.get(arr[i].toUpperCase()) + arr[i]);
            }
        }

        int size = map.size();

        System.out.println(map);
        return "";
    }
}
