package Question_Of_The_Day;
import java.util.*;
public class Bob_and_Single_Digit {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = num;
        while (sum >= 10) {
            int temp = sum;
            sum = 0;
            while (temp > 0) {
                sum += temp % 10;
                temp /= 10;
            }
        }
        System.out.println(sum);
    }
}



/*
Bob and Single Digit
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Bob loves to play with numbers. He is given an integer num and is asked to repeatedly add all its digits until the result has only one digit. Print the final digit.
Input
The input consists of a single integer N.

Constraints
1 ≤ N ≤ 1010
Output
Print the answer.
ai_logoAI CODELENS
BETA
Simpler Explanation
Concepts Used
Example
Sample Input 1
105
Sample Output 1
6

Sample Input 2
76
Sample Output 2
4

 */