package Question_Of_The_Day;
import java.util.*;
public class Sum_of_2050 {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        // check if n is a multiple of 2050
        if (n % 2050 != 0) {
            System.out.println("-1");
            return;

        }

        // divide n by 2050 to get k
        long k = n / 2050;


        // calculate the sum of digits of k
        int sum = 0;
        while (k > 0) {
            sum += k % 10;
            k /= 10;
        }

        System.out.println(sum);
    }
}



/*
Sum of 2050
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
A number is called 2050- number if it is 2050, 20500,. , (2050⋅10k for integer k ≥ 0). Given a number n, you are asked to represent n as the sum of some (not necessarily distinct) 2050 - numbers. Compute the minimum number of 2050 - numbers required for that.
Input
The input consists of an integer N.

Constraints
1 ≤ N ≤ 1018
Output
Output the minimum number of 2050 - numbers in one line. If n cannot be represented as the sum of 2050 - numbers, output −1 instead.
ai_logoASK NEWTON AI
BETA
Simpler Explanation
Concepts Used
Example
Sample Input 1
205
Sample Output 1
-1

Sample Input 2
4100
Sample Output 2
2
 */
