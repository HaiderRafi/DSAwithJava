package Question_Of_The_Day;
import java.util.*;
public class Perfect_Array {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int v = 0;
        for (double i = 0; i < n; i++) {
            double num = sc.nextDouble();
            int z = (int) Math.sqrt(num);
            if (z * z != num) {
                v = 1;
            }
        }
        if (v == 1) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        sc.close();
    }
}



/*
Perfect Array
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an array a of length n, tell us whether it has a non-empty subsequence such that the product of its elements is not a perfect square. A sequence b is a subsequence of an array a if b can be obtained from a by deleting some (possibly zero) elements.
Input
The first line of the input consists of an integer n denoting the length of the array a. The next line consists of n space- separated integers a1, a2, …, an denoting the elements of the array a.

Constraints
1 ≤ n ≤ 100
1 ≤ ai ≤ 104
Output
If there's a subsequence of a whose product isn't a perfect square, print "Yes". Otherwise, print "No".
ai_logoAI CODELENS
BETA
Simpler Explanation
Concepts Used
Example
Sample Input 1
3
1 5 4
Sample Output 1
Yes

Sample Input 2
2
100 10000
Sample Output 2
No
 */
