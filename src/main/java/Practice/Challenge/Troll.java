package Practice.Challenge;

public class Troll {
    public static void main(String[] args) {
        String res = disemvowel("This website is for losers LOL!");
        System.out.println(res);
    }

    public static String disemvowel(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' ||
                    str.charAt(i) == 'o' || str.charAt(i) == 'u' ) {
                // Do nothing
            }
            else if (str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' ||
                    str.charAt(i) == 'O' || str.charAt(i) == 'U' ) {
                // Do nothing
            }
            else {
                result = result + str.charAt(i);
            }
        }

        return result;
    }
}


