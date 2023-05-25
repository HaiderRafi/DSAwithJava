package Question_Of_The_Day;
import java.util.*;
public class Cricket_Innings {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] innings = new int[n];
        for (int i = 0; i < n; i++) {
            innings[i] = sc.nextInt();
        }

        if (isPossible(innings, n, k)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static boolean isPossible(int[] innings, int n, int k) {
        int maxScore = Integer.MIN_VALUE;
        int sum = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {
            sum += innings[i];
            if (innings[i] > maxScore) {
                maxScore = innings[i];
                count = 1;
            } else if (innings[i] == maxScore) {
                count++;
            }
        }
        if (count >= 2 || sum < k) {
            return false;
        }
        int remainingSum = sum - maxScore;
        int remainingInnings = n - 1;
        if (remainingSum == (remainingInnings * k)) {
            return true;
        }
        return ((remainingSum - k) % remainingInnings) == 0;
    }
}
