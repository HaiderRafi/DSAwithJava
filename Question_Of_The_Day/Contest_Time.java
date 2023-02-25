package Question_Of_The_Day;
import java.util.*;
public class Contest_Time {
    public static void main (String[] args) {
        // Your code here
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();

        if(n<9){
            System.out.println("21:0"+n);
        }else if(n>9&&n<60){
            System.out.println("21:"+n);
        }else if(n==60){
            System.out.println("22:00");
        }else{
            int x=n-60;
            if(x<9){
                System.out.println("22:0"+x);
            }else{
                System.out.println("22:"+x);
            }
        }
    }
}





/*
Contest Time
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Newton School Coding Contest usually starts at 21:00 IST and lasts for 100 minutes.
You are given an integer K between 0 and 100 (inclusive). Print the time K minutes after 21:00 in the HH:MM format, where HH denotes the hour on the 24- hour clock and MM denotes the minute. If the hour or the minute has just one digit, append a 0 to the beginning to represent it as a 2- digit integer.
Input
The input consists of a single integer.
K

Constraints
K is an integer between 0 and 100 (inclusive).
Output
Print the time K minutes after 21:00 in the format specified in the Problem Statement.
Example
Sample Input 1
63
Sample Output 1
22:03

Sample Input 2
45
Sample Output 2
21:45

Sample Input 3
100
Sample Output 3
22:40
 */
