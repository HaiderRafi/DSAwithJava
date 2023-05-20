package Question_Of_The_Day;
import java.util.*;
public class Favorite_digit {
    public static void main(String[] args) {
        // Your code here
        Scanner scanner = new Scanner(System.in);

        int q = scanner.nextInt();  // Number of queries
        int d = scanner.nextInt();  // Edward's favorite digit

        for (int i = 0; i < q; i++) {
            int a = scanner.nextInt();  // Query number

            if (canBeSumOfLuckyNumbers(a, d)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        scanner.close();
    }

    // Function to check if a number can be represented as the sum of lucky numbers
    private static boolean canBeSumOfLuckyNumbers(int number, int d) {
        if (number >= d * 10) {
            return true;  // Any number greater than or equal to d*10 can be represented as the sum of lucky numbers
        }

        while (number > 0) {
            if (number % 10 == d || number >= d * 10) {
                return true;  // If the current digit is equal to d or the number is greater than or equal to d*10, it can be represented as the sum of lucky numbers
            }

            number -= d;
        }
        return false;

    }
}
