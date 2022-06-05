package Practice;

public class GetMid {
    public static void main(String[] args) {
        System.out.println(getMiddle("test"));
        System.out.println(getMiddle("middle"));
        System.out.println(getMiddle("testing"));
        System.out.println(getMiddle("A"));
    }
    public static String getMiddle(String word) {
        int mid = word.length() / 2;
        char[] arr = word.toCharArray();
        StringBuilder res;
        if (word.length() % 2 == 0) {
            res = new StringBuilder(String.valueOf(arr[mid - 1]));
            res.append(arr[mid]);
        }
        else {
            res = new StringBuilder(String.valueOf(word.charAt(mid)));
        }
        return String.valueOf(res);
    }
}
