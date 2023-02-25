package Assignments;
import java.util.*;
public class Find_Inverse {
    static int modInverse(int a, int m)
    {

        for (int i = 1; i < m; i++)
            if (((a % m) * (i % m)) % m == 1)
                return i;
        return 1;
    }
    public static void main (String[] args) {
        // Your code here
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int m= sc.nextInt();

        System.out.println(modInverse(a, m));

    }
}


/*
Find Inverse
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
You are given two integers a and m find the Modular Multiplicative inverse of 'a' under modulo 'm'.
Input
The first line of the argument contains two integers 'a' and 'm'.

Constraints
1 <= a , m<= 1e5
Output
Print the Modular Multiplicative inverse of 'a' under modulo 'm'.
Example
Sample Input :
3 11

Sample Output :
4
 */
