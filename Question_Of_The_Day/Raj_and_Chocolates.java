package Question_Of_The_Day;
import java.util.*;
public class Raj_and_Chocolates {
    public static void main (String[] args) {
        // Your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] chocolates = new int[n];

        for (int i = 0; i < n; i++) {
            chocolates[i] = scanner.nextInt();
        }

        int minCost = findMinTotalCost(chocolates);
        System.out.println(minCost);
    }

    private static int findMinTotalCost(int[] chocolates) {
        Arrays.sort(chocolates); // Sort the array in ascending order

        int median = chocolates[chocolates.length / 2]; // Median value
        int minCost = 0;

        for (int i = 0; i < chocolates.length; i++) {
            minCost += Math.abs(chocolates[i] - median); // Calculate the cost
        }

        return minCost;
    }
}
