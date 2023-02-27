package Question_Of_The_Day;
import java.util.*;
public class Digits_Printing {
    public static void main (String[] args) {
        // Your code here
        Scanner sc= new Scanner(System.in);
        String n=sc.next();
        System.out.print(n.charAt(1)+""+n.charAt(2));
    }
}





/*
Digits Printing
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
You are given an integer N of at least 100. Print the last two digits of N. Strictly speaking, print the tens and one's digits of N in this order.
Input
The input consists of an integer.
N

Constraints
100≤N≤999
N is an integer.
Output
Print the answer.
Example
Sample Input 1
254
Sample Output 1
54

Sample Input 2
101
Sample Output 2
01
 */
