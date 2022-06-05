package Practice;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class DuplicateEncoder {
    public static void main(String[] args) {
        System.out.println(encode("   ()(   "));
    }
    static String encode(String word){
        String res = "";

        Map<Character, Integer> list = new HashMap<>();

        word = word.toLowerCase();

        for (int i = 0; i < word.length(); i++){
            if(!list.containsKey(word.charAt(i)))
                list.put(word.charAt(i) , 1);
            else
                list.put(word.charAt(i), list.get(word.charAt(i)) + 1);
        }


        for (int i = 0; i < word.length(); i++) {
            if(list.get(word.charAt(i)) == 1)
                res = res + '(';
            else
                res = res + ')';

        }


        return res;
    }
}
