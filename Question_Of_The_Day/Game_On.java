package Question_Of_The_Day;
import java.util.*;
public class Game_On {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        int k = scanner.nextInt(); // Number of rows
        int l = scanner.nextInt(); // Number of columns

        int[][] grid = new int[k][l];

        // Read the grid values
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < l; j++) {
                grid[i][j] = scanner.nextInt();
            }
        }

        // Determine the winner
        String winner = predictWinner(grid);

        // Print the winner
        System.out.println(winner);

        scanner.close();
    }

    private static String predictWinner(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;

        int aliceMoves = 0;
        int bobMoves = 0;

        // Count the number of moves made by Alice and Bob
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 1) {
                    if ((i == 0 || grid[i - 1][j] == 0) && (j == 0 || grid[i][j - 1] == 0)) {
                        aliceMoves++;
                    } else {
                        bobMoves++;
                    }
                }
            }
        }

        // Determine the winner based on the number of moves
        if (aliceMoves > bobMoves) {
            return "Alice";
        } else {
            return "Bob";
        }
    }
}
