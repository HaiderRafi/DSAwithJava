package Question_Of_The_Day;
import java.util.*;
public class Favourite_X {
    public static void main (String[] args) {
        // Your code here
        Scanner sc=new Scanner(System.in);
        String str=sc.next();

        int strLength=str.length();
        // System.out.println(strLength);

        for(int i=0;i<strLength;i++){
            System.out.print("x");
        }
    }
}


/*
Favourite X
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Alice loves a string with every character x but he has a string s. Can you make such a string for him?
Input
The first line contains a single string s.

Constraints:
S is a string consisting of lowercase English letters.
The length of S is between 1 and 100 (inclusive).
Output
Print the answer.
ai_logoAI CODELENS
BETA
Simpler Explanation
Concepts Used
Example
Sample Input 1:
sardine

Sample Output 1:
xxxxxxx

Sample Input 2:
xxxx

Sample Output 2:
xxxx
 */
