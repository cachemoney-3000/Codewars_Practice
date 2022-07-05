package Practice.kyu5;

public class ZeroOrInfinity {
    public static void main(String[] args) {
        System.out.println(going(523));
    }
    public static double going(int n) {
        double result = 1.0;
        double frac = 1.0;
        while (n > 1) {
            frac /= n--;
            result += frac;
        }
        return (int) (result * 1e6) / 1e6;
    }
}
