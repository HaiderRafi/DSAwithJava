package Question_Of_The_Day;

import java.util.Scanner;

public class Alexa_and_Strings {
    public static void main (String[] args) {
        // Your code here

        Scanner sc= new Scanner(System.in);
        String n=sc.next();
        // System.out.println(n);


        int count=0;
        for(int i=n.length()-1;i>=0;i--){
            if(n.charAt(i)=='a'){
                System.out.println(i+1);
                break;
            }
            else if(!n.contains("a")){
                count++;
            }
        }

        if(count>1){
            System.out.println(-1);
        }
    }
}

/*
Alexa and Strings
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Alexa loves to play with strings. She is given a string S consisting of lowercase English letters.
If 'a' appears in S, print the last index at which it appears; otherwise, print −1. (The index starts at 1. )
Input
The input contains only one string.
S

Constraints
1 <= |S| <= 100
Output
Print the answer.
Example
Sample Input 1
abcdaxayz
Sample Output 1
7

Sample Input 2
bcbbbz
Sample Output 2
-1
*/
