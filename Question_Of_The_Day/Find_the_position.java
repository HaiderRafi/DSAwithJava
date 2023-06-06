package Question_Of_The_Day;
import java.util.*;
public class Find_the_position {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int[][] matrix = new int[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Find the position
        int[] position = findPosition(matrix);

        // Print the result
        System.out.println(position[0] + " " + position[1]);
    }

    public static int[] findPosition(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        int[] rowSums = new int[n];
        int[] colSums = new int[m];

        // Calculate row sums
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                rowSums[i] += matrix[i][j];
            }
        }

        // Calculate column sums
        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n; i++) {
                colSums[j] += matrix[i][j];
            }
        }

        int maxSum = 0;
        int[] position = {1, 1};

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int currentSum = rowSums[i] + colSums[j] - 2 * matrix[i][j];
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                    position[0] = i + 1;
                    position[1] = j + 1;
                } else if (currentSum == maxSum) {
                    if (i + 1 < position[0] || (i + 1 == position[0] && j + 1 < position[1])) {
                        position[0] = i + 1;
                        position[1] = j + 1;
                    }
                }
            }
        }

        return position;
    }
}
