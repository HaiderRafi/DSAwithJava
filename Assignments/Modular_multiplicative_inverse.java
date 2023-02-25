package Assignments;
import java.util.*;
public class Modular_multiplicative_inverse {
    static int modInverse(int A, int M)
    {

        for (int X = 1; X < M; X++)
            if (((A % M) * (X % M)) % M == 1)
                return X;
        return -1;
    }
    public static void main (String[] args) {
        // Your code here
        Scanner sc= new Scanner(System.in);
        int T=sc.nextInt();

        while(T-->0){
            int A=sc.nextInt();
            int M=sc.nextInt();
            System.out.println(modInverse(A, M));
        }
    }
}



/*
Modular multiplicative inverse
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given two integers ‘a’ and ‘m’. The task is to find modular multiplicative inverse of ‘a’ under modulo ‘m’.
Note: Print the smallest modular multiplicative inverse.
Input
First line of input contains a single integer T denoting number of test cases, next T lines contains two space separated integers depicting value of a and m.

Constraints :-
1 < = T < = 100
1 < = m < = 100
1 < = a < = m
Output
For each test case, in a new line print the modular multiplicative inverse if exist else print -1.
Example
Sample Input:-
2
3 11
10 17

Sample Output:-
4
12
 */
