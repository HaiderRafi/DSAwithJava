package Question_Of_The_Day;
import java.util.*;
public class Anisha_and_Chocolates {
    public static void main (String[] args) {
        // Your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        String s = scanner.nextLine();

        int maxSubstringLength = 1;
        int currentSubstringLength = 1;

        for (int i = 1; i < n; i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                currentSubstringLength++;
                maxSubstringLength = Math.max(maxSubstringLength, currentSubstringLength);
            } else {
                currentSubstringLength = 1;
            }
        }

        System.out.println(maxSubstringLength);
    }
}
