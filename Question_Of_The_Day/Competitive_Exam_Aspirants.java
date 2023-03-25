package Question_Of_The_Day;
import java.util.*;
public class Competitive_Exam_Aspirants {
    public static void main (String[] args) {
        // Your code here
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        if(c<=a&&c>=b){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}



/*
Competitive Exam Aspirants
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Every year lakhs of candidates appear for different competitive exams. But there is a limit on the age of appearing. Considering one such exam in our case.

A candidate's age X will be given to you with U(Upper) and L(Lower) limits of the particular exam provided. You need to check whether the candidate will be able to sit for the exam or not. If he/she is able to clear the criteria then print "Yes" otherwise "No"(without quotes).

Note: X, U, L will be in years.
Input
The first and only line of input contains U, L, and X separated by space.

Constraints:
17 <= U, L <= 35
1 <= X <= 100
Output
Print "Yes" or "No".
Example
Sample Input:
28 18 23

Sample Output:
Yes

Sample Input:
32 21 33

Sample Output:
No
 */
