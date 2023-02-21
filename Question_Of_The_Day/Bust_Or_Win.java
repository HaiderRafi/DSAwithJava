package Question_Of_The_Day;

import java.util.Scanner;

public class Bust_Or_Win {
    public static void main (String[] args) {
        // Your code here
        Scanner sc= new Scanner(System.in);
        int x= sc.nextInt();
        int y= sc.nextInt();
        int z= sc.nextInt();

        if(x+y+z>=22){
            System.out.println("bust");
        }else{
            System.out.println("win");
        }
    }
}

/*
Bust Or Win
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Newton is given 3 integer T1, T2 and T3.

If T1 + T2 + T3 ≥ 22, print "bust"; otherwise print "win"
Input
The first and the only line of the input contains 3 positive integers T1, T2 and T3.

Constraints:
1 ≤ T1, T2, T3 ≤ 15
Output
Print the answer in a single line
Example
Sample Input 1:
1 2 3

Sample Output 1:
win


Sample Input 2:
10 10 10

Sample Output 2:
bust
 */
