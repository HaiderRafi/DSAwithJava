package Question_Of_The_Day;

import java.util.Scanner;

public class Choose_Balls {
    public static void main (String[] args) {
        // Your code here
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int m= sc.nextInt();

        n=n*(n-1)/2;
        m=m*(m-1)/2;
        System.out.println(n+m);
    }
}

/*
Choose Balls
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
We have N+M balls, each of which has an integer written on it.
It is known that:
1) The numbers written on the N of the balls are even.
2) The numbers written on the M of the balls are odd.
Find the number of ways to choose two of the N+M balls (disregarding order) so that the sum of the numbers written on them is even.
Input
The first and the only line of the input contains 2 space separated integers, N and M

Constraints:
1) 0 ≤ N, M ≤ 100
2) 2 ≤ N + M
Output
Print the answer
Example
Sample Input 1:
2 1

Sample Output 1:
1

Sample Input 2:
4 3

Sample Output 2:
9

Sample Input 3:
13 3

Sample Output 3:
81
 */
