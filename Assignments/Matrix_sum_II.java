package Assignments;
import java.util.*;
public class Matrix_sum_II {
    public static int numSubmatrices(int[][] matrix, int target) {
        int m = matrix.length, n = matrix[0].length;
        int[][] prefixSum = new int[m][n];
        // compute prefix sum array
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                prefixSum[i][j] = matrix[i][j];
                if (i > 0)
                    prefixSum[i][j] += prefixSum[i - 1][j];
                if (j > 0)
                    prefixSum[i][j] += prefixSum[i][j - 1];
                if (i > 0 && j > 0)
                    prefixSum[i][j] -= prefixSum[i - 1][j - 1];
            }
        }
        // count number of submatrices with sum equal to target
        int count = 0;
        for (int i1 = 0; i1 < m; i1++) {
            for (int i2 = i1; i2 < m; i2++) {
                HashMap<Integer, Integer> map = new HashMap<>();
                map.put(0, 1);
                for (int j = 0; j < n; j++) {
                    int sum = prefixSum[i2][j];
                    if (i1 > 0)
                        sum -= prefixSum[i1 - 1][j];
                    count += map.getOrDefault(sum - target, 0);
                    map.put(sum, map.getOrDefault(sum, 0) + 1);
                }
            }
        }
        return count;
    }
    public static void main (String[] args) {
        // Your code here
        try (Scanner sc = new Scanner(System.in)) {
            // System.out.print("Enter number of rows in the matrix: ");
            int m = sc.nextInt();
            // System.out.print("Enter number of columns in the matrix: ");
            int n = sc.nextInt();
            int[][] matrix = new int[m][n];
            // System.out.println("Enter the elements of the matrix:");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }
            // System.out.print("Enter the target value: ");
            int target = sc.nextInt();
            sc.close();

            int count = numSubmatrices(matrix, target);
            System.out.println(count);
            // System.out.println("Number of submatrices with sum equal to target: " + count);
        }
    }
}



/*
Matrix sum II
hard
hint
Hint

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given a N X M matrix and a target, return the number of non- empty submatrices that sum to target.

A submatrix x1, y1, x2, y2 is the set of all cells matrix[x][y] with x1 <= x <= x2 and y1 <= y <= y2.

Two submatrices (x1, y1, x2, y2) and (x1', y1', x2', y2') are different if they have some coordinate that is different: for example, if x1 != x1'.
Input
First line contains two integers N and M.
Next N lines will contain M integers each denoting the matrix.
Next line contains a single integer target

Constraints:
1 <= N, M <= 100
-1000 <= matrix[i][j] <= 1000
-10^8 <= target <= 10^8
Output
A single integer denoting the answer.
Example
Input:
3 3
0 1 0
1 1 1
0 1 0
0

Output:
4
 */
