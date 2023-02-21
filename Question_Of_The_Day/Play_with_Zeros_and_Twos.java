package Question_Of_The_Day;

import java.util.Scanner;

public class Play_with_Zeros_and_Twos {
    public static void main (String[] args) {
        // Your code here
        Scanner sc= new Scanner(System.in);
        long n=sc.nextLong();

        String str= Long.toBinaryString(n);

        System.out.println(str.replace("1","2"));


        // long s=10;

        // String st=Long.toBinaryString(s);
        // System.out.println(st);

    }
}

/*
Play with 0's and 2's
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Alexa Loves to play with 0's and 2's. Among the positive integers that consist of 0's and 2's when written in base 10, he wanted to find the Kth smallest integer. Help him find that.
Input
Input is given from Standard Input in the following format:

K
Output
Print the answer as an integer.
Here, the exact value must be printed as an integer, even if it is big. Unnecessary leading zeros such as 0523 are not allowed.
Example
Sample Input 1
3
Sample Output 1
22

Sample Input 2
11
Sample Output 2
2022

Sample Input 3
923423423420220108
Sample Output 3
220022020000202020002022022000002020002222002200002022002200

Explanation:
Positive numbers consisting of 0's and 2's are 2,20,22,200,202,220 and so on. Therefore,the 3rd smallest such number is 22.
 */
