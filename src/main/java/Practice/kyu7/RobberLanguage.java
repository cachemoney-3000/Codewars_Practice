package Practice.kyu7;

public class RobberLanguage {
    public static void main(String[] args) {
        System.out.println(findMissing("S.O.S"));
    }
    public static String findMissing(String sentence) {
        char[] arr = sentence.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char c : arr) {
            if (!(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') &&
                    !(c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')) {
                if (!Character.isLetter(c)) {
                    sb.append(c);
                } else if (Character.isUpperCase(c)) {
                    sb.append(c).append('O').append(c);
                } else {
                    sb.append(c).append('o').append(c);
                }
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
