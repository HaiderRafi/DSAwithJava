package Question_Of_The_Day;

import java.util.Scanner;

public class Play_With_Zeros {
    public static void main (String[] args) {
        // Your code here
        Scanner sc= new Scanner(System.in);
        String n=sc.next();

        if(n.length()==4){
            System.out.println(n);
        }else if(n.length()==3){
            System.out.print("0"+n);
        }else if(n.length()==2){
            System.out.print("00"+n);
        }else{
            System.out.print("000"+n);
        }
    }
}


/*
Play With Zeros
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
You are given an integer N between 0 and 9999 (inclusive).
Print it as a four-digit string after appending the necessary number of leading zeros.
Input
The input consists of a single integer.
N

Constraints
0≤N≤9999
N is an integer.
Output
Print the four digit string after appending to it the necessary number of leading zeros.
Example
Sample Input 1
321
Sample Output 1
0321

Sample Input 2
7777
Sample Output 2
7777
 */
