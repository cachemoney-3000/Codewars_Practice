package Practice.kyu6;

/*
Write a function, persistence, that takes in a positive parameter num and returns its
multiplicative persistence, which is the number of times you must multiply the digits
in num until you reach a single digit.
 */

public class Persist {
    public static void main(String[] args) {
        System.out.println(persistence(25));
    }
    public static int persistence(long n) {
        long x = n;
        long prod = 1;
        int counter = 0;

        while (x > 0) {
            if (x / 10 == 0)
                break;

            while (x > 0) {
                prod = prod * (x % 10);
                x = x / 10;
            }
            x = prod;

            counter++;
            prod = 1;
        }

        return counter;
    }
}
