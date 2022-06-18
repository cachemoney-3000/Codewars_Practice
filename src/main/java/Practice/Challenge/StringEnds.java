package Practice.Challenge;

public class StringEnds {
    public static void main(String[] args) {
        System.out.println(solution("abc\n", "abc"));
    }
    public static boolean solution(String str, String ending) {
        return str.endsWith(ending);
    }
}
