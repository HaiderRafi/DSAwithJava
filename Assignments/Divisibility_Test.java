package Assignments;
import java.util.*;
public class Divisibility_Test {
    public static void main (String[] args) {
        // Your code here
        Scanner sc= new Scanner(System.in);
        String str= sc.next();


        int sum=0;
        int n=str.length();
        int lastdigit=str.charAt(n-1)- '0';

        for(int i=0;i<n;i++){
            sum=sum+(str.charAt(i)-'0');
        }
        if(sum%3==0 && lastdigit==0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}



/*
Divisibility Test
easy
asked in interviews by 1 company
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
You are given a big number in form of a string A of characters from 0 to 9.

Check whether the given number is divisible by 30 .
Input
The first argument is the string A.

Constraints
1 ≤ |A| ≤ 105
Output
Return "Yes" if it is divisible by 30 and "No" otherwise.
Example
Sample Input :
3033330

Sample Output:
Yes
 */
