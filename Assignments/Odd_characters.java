package Assignments;
import java.util.*;
public class Odd_characters {
    public static void main (String[] args) {
        // Your code here
        Scanner sc= new Scanner(System.in);
        String str= sc.next();
        for(int i=0; i<str.length();i++){
            if(i%2==0){
                System.out.print(str.charAt(i)+ " ");
            }
        }
    }
}



/*
Odd characters
easy
asked in interviews by 1 company
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given a string(1-indexed). Print all the characters of the string at odd positions.
Input
The first line of the input contains a string S. String contains only lowercase english letters.

Constraints:-
1 <= |S| <= 100
Output
The output should contain the character's at odd positions seperated by space.
Example
Sample Input
abcde

Sample Output
a c e

Sample Input
abcd

Sample Output
a c

Explanation:
index => 1 2 3 4
chars => a b c d
a and c are at odd index.
 */
