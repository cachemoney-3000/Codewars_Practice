package Practice.Fundamentals;

public class Positive {
    public static void main(String[] args) {
        sum(new int[]{1,2,3,4,5});
    }
    public static int sum(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                sum += arr[i];
            }
        }
        return sum;
    }
}
