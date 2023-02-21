package Question_Of_The_Day;

import java.util.Scanner;

public class Kick_Palindrome {
    public static void main (String[] args) {
        // Your code here
        Scanner sc= new Scanner(System.in);
        String str= sc.next();

        int count=0;

        for (int i = 0; i <= str.length() / 2-1; i++) {
            char start = str.charAt(i);
            char end = str.charAt(str.length()-1  - i);
            if(start != end){
                count++;
            }
        }
        System.out.println(count);
    }
}

/*
Kick Palindrome
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Newton got a string as a gift on Christmas. Newton likes palindromes so he decides to make this string into a palindrome. He can kick the string and after every kick, he can change any one of its characters to any other character of his choice.
Find the minimum number of times that Newton has to kick the string.
Input
The first and the only line of the input contains a single string S

Constraints:

1 ≤ |S| ≤ 1000

All characters in S are in lowercase and are English letters

Output
Output the answer
Example
Sample Input 1:
newton

Sample Output 1:
2


Sample Input 2:
abbcbba

Sample Output 2:
0

Sample Explanation 1:
In the first kick, Newton changes the 2nd character to 'o'
In the second kick, Newton changes the 4th character to 'w'.
Thus, the final word is "nowwon" which is a palindrome.
 */
