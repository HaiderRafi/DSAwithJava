package Question_Of_The_Day;
import java.util.*;
public class Aditi_and_Number_System {
    public static void main (String[] args) {
        // Your code here
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long k = scanner.nextLong();

        long oddCount = (n % 2 == 0) ? n / 2 : (n + 1) / 2;

        if (k <= oddCount) {
            long number = 2 * k - 1;
            System.out.println(number);
        } else {
            long evenCount = n / 2;
            long number = 2 * (k - oddCount);
            System.out.println(number);
        }
    }
}


/*
Aditi and Number System
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Aditi decided to list down all natural numbers from 1 to n in the following order:
She first writes down all odd integers from 1 to n (in ascending order), then all even integers from 1 to n (also in ascending order). Help her find the integer at position k.
Input
The input consists of two space-separated integers n and k.

Constraints
1 ≤ k ≤ n ≤ 1012
Output
Print the number that will stand at position number k.
ai_logoAI CODELENS
BETA
Simpler Explanation
Concepts Used
Example
Sample Input 1
10 3
Sample Output 1
5

Sample Input 2
7 7
Sample Output 2
6
 */