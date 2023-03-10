package Assignments;
import java.util.*;
public class Binary_representation {
    public static void binary(int n){

        if(n>1)
            binary(n/2);
        System.out.print(n%2);
    }

    public static void main (String[] args) {
        // Your code here
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        binary(n);

    }
}



/*
Binary representation
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an integer N, your task is to represent the given integer as a binary number.
Input
Input contains a single integer containing the value of N.

Constraints:-
0 <= N <= 1000000000
Output
Print a string containing the binary representation of the given integer.
Example
Sample Input:-
9

Sample Output:-
1001

Sample input:-
3

Sample Output:-
11
 */
