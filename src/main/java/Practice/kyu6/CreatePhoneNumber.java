package Practice.kyu6;

public class CreatePhoneNumber {
    public static void main(String[] args) {
        System.out.println(createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
    }
    public static String createPhoneNumber(int[] numbers) {
        StringBuilder sb = new StringBuilder();
        sb.append("(");
        for (int i = 0; i < numbers.length; i++) {
            sb.append(numbers[i]);
            if (i == 2)
                sb.append(") ");

            else if (i == 5)
                sb.append("-");
        }
        return sb.toString();
    }
}
