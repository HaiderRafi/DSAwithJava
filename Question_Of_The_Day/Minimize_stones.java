package Question_Of_The_Day;
import java.util.*;
public class Minimize_stones {
    public static void main (String[] args) {
        // Your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int s = scanner.nextInt();
        int count = 0;

        while (s > 0) {
            int stones = s / n;
            count += stones;
            s -= stones * n;
            n--;
        }

        System.out.println(count);
    }
}
