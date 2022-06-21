package Practice.kyu6;


public class DigitalRoot {
    public static void main(String[] args) {
        System.out.println(digital_root(456));
    }

    public static int digital_root(int n) {
        int mod;
        int sum = 0;

        while (n > 0) {
            mod = n % 10;
            sum += mod;
            n = n / 10;
        }

        if (sum / 10 > 0) {
            sum = digital_root(sum);
        }

        return sum;
    }
}
