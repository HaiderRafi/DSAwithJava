package Assignments;
import java.util.*;
public class Find_it {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        long k = Long.parseLong(sc.next());

        boolean status = false;

        for (long i = 1; ((i * i) + (3 * i)) <= k; i++) {
            if (((i * i) + (3 * i)) == k) {
                System.out.println(i);
                status = true;
                break;
            }
        }
        if (status == false) {
            System.out.println(-1);
        }
    }
}



/*
Find it!!
easy
hint
Hint

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an integer K, find a positive integer x such that K = x2 + 3*x. If no such positive integer x exists, print -1.
Input
First and the only line of the input contains an integer K.

Constraints:
1 <= K <= 1018
Output
Print a positive integer x such that the above equation satisfies. If no such integer x exists, print -1.
Example
Sample Input:
28

Sample Output:
4

Explaination:
42 + 3*4 = 28
There is no other positive integer that will give such result.
 */
