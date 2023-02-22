package Assignments;
import java.util.*;
public class Check_if_Leap_year {
    public static void main (String[] args) {
        // Your code here

        Scanner sc= new Scanner(System.in);
        int year =sc.nextInt();
        if(year%400==0){ //multiple of 400, fully divided by 400
            System.out.println("YES");
            return ;  // come out of the function
        }
        if(year%100 ==0){ // not multiple of 400 but milriple of 100
            System.out.println("NO");
            return ;
        }
        if(year%4 ==0){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}

/*
Check if Leap year
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given a year(an integer variable) as input, find if it is a leap year or not.
Note: Leap year is the year that is multiple of 4. But, multiples of 100 which are not multiples of 400 are not leap years.
Input
The input contains a single integer N

Constraint:
1 <= n <= 104
Output
Print "YES" if the year is a leap year else print "NO".
Example
Sample Input:
2000

Sample Output:
YES

Sample Input:
2003

Sample Output:
NO

Sample Input:
1900

Sample Output:
NO
 */
