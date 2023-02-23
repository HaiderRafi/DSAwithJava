package Assignments;
import java.util.*;
public class Rev_Strings {
    public static void main (String[] args) {
        // Your code here
        Scanner sc= new Scanner(System.in);
        String str= sc.next();

        for(int i=str.length()-1;i>=0;i--){
            System.out.print(str.charAt(i));
        }
    }
}



/*
Rev Strings
easy
asked in interviews by 47 companies
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
You are given a string your task is to reverse the given string.
Input
The first line of the input contains a string.

Constraints:-
1 <= string length <= 100
String contains only lowercase english letters
Output
The output should contain reverse of the input string.
Example
Sample Input
abc

Sample Output
cba
 */
