package Question_Of_The_Day;
import java.util.*;
public class Arithmetic_Mean_Deviation {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a1 = scanner.nextInt();
        int a2 = scanner.nextInt();
        int a3 = scanner.nextInt();

        int s = a1 + a2 + a3;

        if (s % 3 == 0) {
            System.out.println(0);
        } else {
            System.out.println(1);
        }

        scanner.close();
    }
}


/*
Arithmetic Mean Deviation
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
A number a2 is said to be the arithmetic mean of two numbers a1 and a3, if the following condition holds: a1+a3=2⋅a2.
We define an arithmetic mean deviation of three numbers a1, a2 and a3 as follows: d(a1, a2, a3)=|a1+a3−2⋅a2|.

Arithmetic means a lot to Jeevan. He has three numbers a1, a2, and a3 and he wants to minimize the arithmetic mean deviation d(a1, a2, a3).

To do so, he can perform the following operation any number of times (possibly zero):
- Choose i, j from {1, 2, 3} such that i≠j and increment ai by 1 and decrement aj by 1
Help Jeevan find out the minimum value of d(a1, a2, a3) that can be obtained after applying the operation any number of times.
Input
The input consists of three space- separated integers a1, a2 and a3.

Constraints
1 ≤ a1, a2 and a3 ≤ 108
Output
Print the minimum value of d(a1, a2, a3) that can be obtained after applying the operation any number of times.
ai_logoAI CODELENS
BETA
Simpler Explanation
Concepts Used
Example
Sample Input 1
3 4 5
Sample Output 1
0

Sample Input 2
2 2 6
Sample Output 2
1
 */
