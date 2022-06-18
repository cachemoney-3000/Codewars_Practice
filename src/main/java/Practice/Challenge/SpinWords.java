package Practice.Challenge;

import java.util.Arrays;

public class SpinWords {
    public static void main(String[] args) {
        System.out.println(new SpinWords().spinWords("Hey fellow warriors"));
    }

    public String spinWords(String sentence) {
        String[] arr = sentence.split(" ");

        StringBuilder sb = new StringBuilder();
        for (String s : arr) {
            if (s.length() > 5)
                sb.append(reverse(s)).append(" ");
            else
                sb.append(s).append(" ");
        }

        return sb.deleteCharAt(sb.length()-1).toString();
    }

    public String reverse(String sentence) {
        char[] temp = sentence.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = sentence.length() - 1; i >= 0; i--){
            sb.append(temp[i]);
        }
        return sb.toString();
    }
}
