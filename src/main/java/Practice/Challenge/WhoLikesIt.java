package Practice.Challenge;

public class WhoLikesIt {
    public static void main(String[] args) {

    }

    public static String whoLikesIt(String... names) {
        if (names.length == 0)
            return "no one likes this";

        else if (names.length == 1)
            return names[0] + " likes this";

        else if (names.length == 2)
            return names[0] + " and " + names[1] + " like this";


        String name1 = names[0];
        String name2 = names[1];
        int counter = 2;

        if (names.length > 3){
            int peopleLeft = names.length - counter;
            return name1 + ", " + name2 + " and " + peopleLeft + " others like this";
        }

        String name3 = names[2];
        return name1 + ", " + name2 + " and " + name3 + " like this";
    }

}
