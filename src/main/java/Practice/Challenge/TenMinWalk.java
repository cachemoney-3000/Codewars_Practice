package Practice.Challenge;

public class TenMinWalk {
    public static void main(String[] args) {
        System.out.println(TenMinWalk.isValid(new char[] {'n','s','n','s','n','s','n','s','n','s'}));
        System.out.println(TenMinWalk.isValid(new char[] {'w','e','w','e','w','e','w','e','w','e','w','e'}));
        System.out.println(TenMinWalk.isValid(new char[] {'w'}));
        System.out.println(TenMinWalk.isValid(new char[] {'n','n','n','s','n','s','n','s','n','s'}));

    }
    public static boolean isValid(char[] walk) {
        if (walk.length != 10)
            return false;

        int x = 0, y = 0;

        // Must come back to the original starting point
        for (char c : walk) {
            switch (c) {
                case 'n' -> y++;
                case 's' -> y--;
                case 'w' -> x++;
                case 'e' -> x--;
            }
        }

        return x == 0 && y == 0;
    }
}
