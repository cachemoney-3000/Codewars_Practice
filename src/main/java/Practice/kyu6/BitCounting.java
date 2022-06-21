package Practice.kyu6;

public class BitCounting {
    public static void main(String[] args) {
        System.out.println(countBits(1234));
    }
    public static int countBits(int n){
        int bitCounter = 0;
        while (n > 0) {
            if (n % 2 != 0) {
                bitCounter++;
            }
            n = n / 2;
        }
        return bitCounter;
    }
}
