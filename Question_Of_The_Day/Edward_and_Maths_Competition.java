package Question_Of_The_Day;

import java.util.Scanner;

public class Edward_and_Maths_Competition {
    public static void main (String[] args) {
        // Your code here
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();

        int odd=0;
        int even=0;
        for(int i=0; i<n;i++){
            if(i%2==0){
                even++;
            }if(i%2!=0){
                odd++;
            }
        }
        int x=odd*even;
        System.out.println(x);
    }
}

/*
Edward and Maths Competition
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Edward participated in one maths competition. He was asked to find the number of ways to choose a pair of an even number and an odd number from the positive integers between 1 and N (inclusive). The order does not matter.
Input
The input line contains only one input N.

Constraints
2≤N≤100
N is an integer.
Output
Print the number of ways to choose a pair of an even number and an odd number from the positive integers between 1 and N (inclusive).
Example
Sample Input 1
3

Sample Output 1
2

Sample Input 2
6

Sample Output 2
9

Sample Input 3
11

Sample Output 3
30
 */
