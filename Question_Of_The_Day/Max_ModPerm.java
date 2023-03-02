package Question_Of_The_Day;
import java.util.*;
public class Max_ModPerm {
    public static void main (String[] args) {
        // Your code here
        Scanner sc= new Scanner(System.in);
        long n=sc.nextLong();
        System.out.println(n*(n+1)/2-n);
    }
}



/*
Max ModPerm
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Newton is given an integer N, he has to perform 3 steps on it.
First, he has to create permutations of numbers from 1 to N. Let the permutation be P1, P2,. ., PN.
Second, He has to find the remainder, Ri, after dividing i with Pi for all i from 1 to N. Let the sequence be R1, R2,. ., RN.
Third, find the sum of all the remainders, i. e. R1 + R2 +. . + RN.
Now Newton has to choose the starting permutation in such a way that the sum of the remainders after the third step is the maximum possible. Print the maximum possible value.
Input
The first and the only line of the input contains a single integer N

Constraints;
1 ≤ N ≤ 109
Output
Output the maximum value possible by adding the remainder.
Example
Sample Input 1:
2

Sample Output 1:
1

Sample Input 2:
13

Sample Output 2:
78

Sample Explanation 1:
The permutation is {2, 1}
Remainders will be {0, 1}
The sum is 1.
 */
