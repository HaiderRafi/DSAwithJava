package Question_Of_The_Day;
import java.util.*;
public class Rohit_and_Balls {
    public static void main (String[] args) {
        // Your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();

        int z=n-a;
        int y=z+b;
        System.out.println(y);
    }
}




/*
Rohit and Balls
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Rohit loves to play with balls. He removed A balls from a box that contained N balls and then put B new balls into that box. How many balls does the box contain now?
Input
The input consists of 3 space separated integers.
N A B

Constraints
All values in input are integers.
100≤N≤200
1≤A, B≤100
Output
Print the answer as an integer.
Example
Sample Input 1
100 1 2
Sample Output 1
101

Sample Input 2
100 2 1
Sample Output 2
99
 */
