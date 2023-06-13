package Question_Of_The_Day;
import java.util.*;
public class Maximum_black {
    public static void main (String[] args) {
        // Your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // number of rows
        int m = scanner.nextInt(); // number of columns
        scanner.nextLine(); // consume the newline character

        int[][] grid = new int[n][m];

        // Read the input grid
        for (int i = 0; i < n; i++) {
            String row = scanner.nextLine();
            for (int j = 0; j < m; j++) {
                if (row.charAt(j) == '#') {
                    grid[i][j] = 1; // black cell represented as 1
                } else {
                    grid[i][j] = 0; // white cell represented as 0
                }
            }
        }

        int maxConsecutiveBlackCells = 0;

        // Check each row for consecutive black cells
        for (int i = 0; i < n; i++) {
            int consecutiveBlackCells = 0;
            int currentConsecutiveBlackCells = 0;

            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1) {
                    currentConsecutiveBlackCells++;
                } else {
                    currentConsecutiveBlackCells = 0;
                }

                consecutiveBlackCells = Math.max(consecutiveBlackCells, currentConsecutiveBlackCells);
            }

            maxConsecutiveBlackCells = Math.max(maxConsecutiveBlackCells, consecutiveBlackCells);
        }

        System.out.println(maxConsecutiveBlackCells);
    }
}
