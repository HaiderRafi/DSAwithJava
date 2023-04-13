package Question_Of_The_Day;
import java.util.*;
public class Square_Sequence {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long s = sc.nextLong();

        if (s == 0){
            System.out.println(0);
        }
        else{
            System.out.println(s / (n * n));
        }
    }
}



/*
Square Sequence
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Luis has a sequence of n+1 integers a1, a2, …, an+1. For each i=1, 2, …, n+1 it is guaranteed that 0 ≤ ai < n, or ai=n2. He has calculated the sum of all the elements of the sequence and called this value s.
Luis has lost his sequence, but he remembers the values of n and s. Can you find the number of elements in the sequence that are equal to n2?
Input
The input consists of two space separated integers n and s.

Constraints
1 ≤ n < 106
0 ≤ s ≤ 1018
Output
Print one integer — the number of elements in the sequence which are equal to n2.
ai_logoNEWTON AI
BETA
Simpler Explanation
Concepts Used
Example
Sample Input 1
7 0
Sample Output 1
0

Sample Input 1
2 12
Sample Output 1
3
 */
