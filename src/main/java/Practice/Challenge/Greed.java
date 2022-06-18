package Practice.Challenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Greed {
    public static void main(String[] args) {
        System.out.println(greedy(new int[]{2, 4, 4, 5, 4}));
        System.out.println(greedy(new int[]{3, 4, 5, 3, 3}));
        System.out.println(greedy(new int[]{1, 5, 1, 3, 4}));
        System.out.println(greedy(new int[]{2, 3, 2, 6, 2}));
    }
    public static int greedy(int[] dice){
        System.out.println(Arrays.toString(dice));
        // Populate the rules values
        HashMap<String, Integer> values = new HashMap<>();
        values.put("55", 600);
        values.put("45", 550);
        values.put("51", 1200);
        values.put("41", 1100);
        values.put("31", 1000);
        values.put("36", 600);
        values.put("35", 500);
        values.put("34", 400);
        values.put("33", 300);
        values.put("32", 200);
        values.put("21", 200);
        values.put("25", 100);
        values.put("11", 100);
        values.put("15", 50);

        // Get the roll information
        HashMap<Integer, Integer> roll = new HashMap<>();
        for (int die : dice) {
            if (roll.containsKey(die)){
                if (roll.get(die) < 3 || roll.containsKey(1) ||  roll.containsKey(5)){
                    roll.put(die, roll.get(die) + 1);
                }
            }
            else
                roll.put(die, 1);
        }

        // Calculate the score
        int score = 0;
        for (int i = 0; i < roll.size(); i++) {

            StringBuilder sb = new StringBuilder();
            sb.append(roll.values().toArray()[i]);
            sb.append(roll.keySet().toArray()[i]);
            if (values.containsKey(String.valueOf(sb)))
                score = values.get(String.valueOf(sb)) + score;

        }
        return score;
    }
}
