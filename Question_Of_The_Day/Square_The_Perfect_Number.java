package Question_Of_The_Day;
import java.util.*;
public class Square_The_Perfect_Number {
    public static void main (String[] args) {
        // Your code here
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n/2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        if (sum == n) {
            System.out.println(n * n);
        } else {
            System.out.println(-1);
        }
    }
}



/*
Square The Perfect Number
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
You are given an integer. Print the square of the number if it's a perfect number else print -1.
A perfect number is a positive integer that is equal to the sum of its positive divisors, excluding the number itself. A divisor of an integer x is an integer that can divide x evenly.
Input
The input consists of a single integer N.

Constraints
1 ≤ N ≤ 105
Output
Print the square of the number if it's a perfect number else print -1.
ai_logoASK NEWTON AI
BETA
Simpler Explanation
Concepts Used
Example
Sample Input 1
28
Sample Output 1
784

Sample Input 1
7
Sample Output 1
-1
 */
