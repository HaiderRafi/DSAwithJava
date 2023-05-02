package Question_Of_The_Day;
import java.util.*;
public class Nitin_and_Numbers {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int max = -1;
        for (int i = 0; i < str.length(); i++) {
            int digit = Character.getNumericValue(str.charAt(i));
            if (digit > max) {
                max = digit;
            }
        }
        System.out.println(max);
    }
}


/*
Nitin and Numbers
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
IPL is around the corner. Nitin Menon loves to represent all the numbers in the form of 1 or 0 or some combination of it. Given a number n, you are asked to help him represent n as a sum of some (not necessarily distinct) binary decimals (a number is called a binary decimal if it's a positive integer and all digits in its decimal notation are either 0 or 1). Compute the smallest number of binary decimals required for that.
Input
The input consists of an integer n denoting the number to be represented.

Constraints
1 ≤ n ≤ 109
Output
Print the smallest number of binary decimals required to represent n as a sum.
ai_logoAI CODELENS
BETA
Simpler Explanation
Concepts Used
Example
Sample Input 1
121
Sample Output 1
2

Sample Input 2
5
Sample Output 2
5
 */
