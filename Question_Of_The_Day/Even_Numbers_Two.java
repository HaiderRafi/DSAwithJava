package Question_Of_The_Day;

import java.util.Scanner;

public class Even_Numbers_Two {
    public static void main (String[] args) {
        // Your code here
        Scanner sc= new Scanner (System.in);
        int n= sc.nextInt();
        int m= sc.nextInt();

        int count=0;
        for(int i=n+1;i<=m;i=i+1){
            if(i%2==0){
                count++;
                System.out.print(i + " ");
            }
            if(count==5){
                break;
            }
        }
    }
}

/*
Even Numbers - 2
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Newton loves EVEN numbers.

You are given two integers N and M. Generate 5 unique even numbers for Newton between N and M (excluding both).
Input
The first and only line of input contains integer N and integer M.


Constraints
-103 ≤ N ≤ M ≤ 103
10 ≤ M-N
Output
The only line of output contains 5 singly spaced integers satisfying the constraints.
Example
Sample Input
0 20

Sample Output
2 6 8 18 14
 */
