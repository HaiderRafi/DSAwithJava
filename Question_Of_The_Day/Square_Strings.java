package Question_Of_The_Day;
import java.util.*;
public class Square_Strings {
    public static void main (String[] args) {
        // Your code here
        Scanner sc=new Scanner(System.in);
        String str=sc.next();

        if(str.length()%2!=0){
            System.out.println("No");
        }else{
            String firstHalf="";
            String secondHalf="";

            for(int i=0;i<str.length()/2;i++){
                firstHalf+=str.charAt(i);
            }

            for(int i=str.length()-1;i>=str.length()/2;i--){
                secondHalf+=str.charAt(i);
            }

            StringBuilder sb = new StringBuilder(secondHalf);
            String SecondreversedHalf = sb.reverse().toString();

            if(firstHalf.equals(SecondreversedHalf)){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }
}


/*
Square Strings
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
A string is called square if it is some string written twice in a row. For example, the strings "aa", "abcabc", "abab" and "baabaa" are square. But the strings "aaa", "abaaab" and "abcdabc" are not square. For a given string s determine if it is square.
Input
The input consists of a string S consisting of lowercase English alphabets.

Constraints
The length of the string is between 1 to 100.
Output
Print Yes if the string in the corresponding test case is square, No otherwise.
ai_logoAI CODELENS
BETA
Simpler Explanation
Concepts Used
Example
Sample Input 1
aaa
Sample Output 1
No

Sample Input 2
xyxy
Sample Output 2
Yes
 */
