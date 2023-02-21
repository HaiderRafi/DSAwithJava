package Question_Of_The_Day;

import java.util.Scanner;

public class Bob_and_Digits {
    public static void main (String[] args) {
        // Your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();//integer
        int k=sc.nextInt();//base
        int dig = (int)(Math.floor(Math.log(n) / Math.log(k))+ 1);
        System.out.println(dig);
    }
}
/*
Bob and Digits
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Bob loves to play with numbers. He has an integer N. Find the number of digits that N has in base K.
Input
The input contains two space-separated integers in the following format:
N K

Constraints
All values in the input are integers.
1 ≤ N ≤ 109
2 ≤ K ≤ 10
Output
Print the number of digits that N has in base K.
Example
Sample Input 1
11 2
Sample Output 1
4

Sample Input 2
1010101 10
Sample Output 2
7

Sample Input 3
314159265 3
Sample Output 3
18
 */
