package Question_Of_The_Day;
import java.util.*;
public class Divisor_greater_than_1 {
    public static void main (String[] args) {
        // Your code here
        Scanner scanner = new Scanner(System.in);
        long N = scanner.nextLong();

        if (N % 2 == 0) {
            while (N % 2 == 0) {
                N /= 2;
            }
        }
        if (N > 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
