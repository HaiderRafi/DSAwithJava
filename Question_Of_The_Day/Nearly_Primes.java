package Question_Of_The_Day;
import java.util.*;
public class Nearly_Primes {
    public static void main (String[] args) {
        // Your code here
        int[] Prime = new int[3000];
        Prime[0] = 2;
        Prime[1] = 3;
        int ptr = 2;
        for (int i = 5; i <= 3500; i += 2) {
            int j;
            for (j = 0; j < ptr; j++)
                if (i % Prime[j] == 0)
                    break;
            if (j >= ptr)
                Prime[ptr++] = i;
        }
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            int ans = 0;
            for (int i = 6; i <= n; i++) {
                int count = 0;
                for (int j = 0; Prime[j] <= i; j++)
                    if (i % Prime[j] == 0)
                        count++;
                if (count == 2)
                    ans++;
            }
            System.out.println(ans);
        }
    }
}



/*
Nearly Primes
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
A number is called nearly prime if it has exactly two distinct prime divisors. For example, numbers 6, 18, 24 are nearly prime, while 4, 8, 9, 42 are not. Find the number of nearly prime numbers which are between 1 and n, inclusive.
Input
The input consists of an integer n.

Constraints
1 ≤ n ≤ 3000
Output
Print the number of nearly prime numbers which are between 1 and n, inclusive.
ai_logoAI CODELENS
BETA
Simpler Explanation
Concepts Used
Example
Sample Input 1
10
Sample Output 1
2

Sample Input 2
21
Sample Output 2
8
 */
