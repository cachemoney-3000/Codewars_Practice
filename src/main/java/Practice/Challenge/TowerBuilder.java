package Practice.Challenge;

import java.util.Arrays;

public class TowerBuilder {
    public static void main(String[] args) {
        towerBuilder(6);
    }

    public static String[] towerBuilder(int nFloors)
    {
        int k = 0;
        String[] pyramid = new String[nFloors];
        // Loop through each levels
        for (int i = 1; i <= nFloors; i++, k = 0) {
            StringBuilder sb = new StringBuilder();
            // First half of space
            for (int space = 1; space <= nFloors - i; space++)
                sb.append(" ");
            // Stars at the middle
            while (k != 2 * i - 1) {
                sb.append("*");
                k++;
            }
            // Second half of space
            for (int space = 1; space <= nFloors - i; space++)
                sb.append(" ");
            // Add the completed level to the pyramid array
            pyramid[i - 1] = sb.toString();
        }
        // return the final result
        return pyramid;
    }

}
/*
          "     *     ", 1
          "    ***    ", 3
          "   *****   ", 5
          "  *******  ", 7
          " ********* ", 9
          "***********"  11
 */