package Practice.kyu5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BestTravel {
    private static final List<Integer> sums = new ArrayList<>();
    public static void main(String[] args) {
        List<Integer> ts = new ArrayList<>(Arrays.asList(91, 74, 73, 85, 73, 81, 87));
        System.out.println(chooseBestSum(230, 3, ts));
        System.out.println(sums);
    }
    public static Integer chooseBestSum(int t, int k, List<Integer> ls) {
        if (k > ls.size()) return null;

        getCombinations(ls, k, 0, new int[k]);

        int bestSum = 0;
        Collections.sort(sums);
        for (Integer sum : sums) {
            if (sum > t) {
                break;
            }
            bestSum = sum;
        }

        return bestSum;
    }

    public static void getCombinations (List<Integer> ls, int len, int startPos, int[] res) {
        if (len == 0) {
            int sum = 0;
            for (int re : res) {
                sum += re;
            }
            sums.add(sum);
            return;
        }

        for (int i = startPos; i <= ls.size() - len; i++) {
            res[res.length - len] = ls.get(i);
            getCombinations(ls, len - 1, i + 1, res);
        }
    }
}
