package Question_Of_The_Day;
import java.util.*;
public class Find_X {
    public static void main (String[] args) {
        // Your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = scanner.nextInt();

        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (x % i == 0 && x / i <= n) {
                count++;
            }
        }

        System.out.println(count);
    }
}


/*
Find X
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Let's consider a table consisting of n rows and n columns. The cell located at the intersection of i- th row and j- th column contains number i × j. The rows and columns are numbered starting from 1. You are given a positive integer x. Your task is to count the number of cells in a table that contain number x.
Input
The input consists of two space- separated integers n and x.

Constraints
1 ≤ n ≤ 105
1 ≤ x ≤ 109
Output
Print a single number: the number of times x occurs in the table.
Example
Sample Input 1
10 5
Sample Output 1
2

Sample Input 2
6 12
Sample Output 2
4
 */
