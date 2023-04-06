package Question_Of_The_Day;
import java.util.*;
public class Maximise_K {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 31; i >= 0; --i) {
            if ((n & (1 << i)) != 0) {
                System.out.println((1 << i) - 1);
                break;
            }
        }
    }
}



/*
Maximise K
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an integer n, find the maximum value of integer k such that the following condition holds:
n & (n−1) & (n−2) & (n−3) &. . (k) = 0 where & denotes the bitwise AND operation.
Input
The input consists of an integer N.

Constraints
1 ≤ N ≤ 109
Output
Output a single integer — the required integer k.
ai_logoASK NEWTON AI
BETA
Simpler Explanation
Concepts Used
Example
Sample Input 1
2
Sample Output 1
1

Sample Input 2
17
Sample Output 2
15
 */
