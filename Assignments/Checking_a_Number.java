package Assignments;
import java.util.*;
public class Checking_a_Number {
    public static void main (String[] args) {
        // Your code here
        Scanner scan= new Scanner(System.in);
        int num= scan.nextInt();
        int result = 0;

        if (num>0){
            result= 1;
        }
        if (num<0){
            result= -1;
        }



        switch (result){
            case -1:
                System.out.println("Negative");
                break;

            case 1:
                System.out.println("Positive");
                break;

            default:
                System.out.println("Zero");
                break;
        }

    }
}


/*
Checking a Number
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Write a program to check whether a number is positive, negative or zero using switch case.
Input
The first line of the input contains the number

Constraints
-109 ≤ n ≤ 109
Output
Print the single line wether it's "Positive", "Negative" or "Zero"
Example
Sample Input :
13

Sample Output :
Positive

Sample Input :
-13

Sample Output :
Negative
 */
