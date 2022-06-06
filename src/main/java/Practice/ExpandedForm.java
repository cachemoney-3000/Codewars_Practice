package Practice;

import java.util.ArrayList;
import java.util.Arrays;

public class ExpandedForm {
    public static void main(String[] args) {
        System.out.println(expandedForm(7065));
    }
    public static String expandedForm(int num)
    {
        ArrayList<Integer> arr = new ArrayList<>();
        int temp = num;
        while(temp != 0) {
            arr.add(temp % 10);
            temp = temp / 10;
        }

        int[] t = arr.stream().mapToInt(i -> i).toArray();
        StringBuilder sb = new StringBuilder();

        for (int i = t.length - 1; i >= 0  ; i--){
            if (t[i] != 0){
                sb.append(t[i]);
                if (i > 0)
                    sb.append("0".repeat(i));
                sb.append(" + ");
            }
        }
        // Remove the redundant +
        return sb.substring(0, sb.length() - 3);
    }
}
