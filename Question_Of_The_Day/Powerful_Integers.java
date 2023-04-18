package Question_Of_The_Day;
import java.util.*;
public class Powerful_Integers {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (isPowerful(i)) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static boolean isPowerful(int num) {
        // Check if num has only one non-zero digit
        int count = 0;
        while (num > 0) {
            if (num % 10 != 0) {
                count++;
            }
            num /= 10;
        }
        return count == 1;
    }
}
