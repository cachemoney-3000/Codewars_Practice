package Practice.Fundamentals;

public class BuildPileCubes {
    public static void main(String[] args) {
        findNb(24723578342962L);
    }
    public static long findNb(long m) {
        int tracker = 1;

        while (m > 0L) {
            long cube = (long) tracker * tracker * tracker;
            m = m - (cube);
            tracker++;

        }
        if (m < 0) return -1L;

        return tracker - 1L;
    }
}
