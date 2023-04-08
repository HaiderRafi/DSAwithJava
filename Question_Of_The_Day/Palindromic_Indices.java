package Question_Of_The_Day;
import java.util.*;
public class Palindromic_Indices {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            String sub = s.substring(0, i) + s.substring(i + 1);
            if (isPalindrome(sub)) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }

    public static boolean isPalindrome(String s) {
        int n = s.length();
        for (int i = 0; i < n / 2; i++) {
            if (s.charAt(i) != s.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }
}



/*
Palindromic Indices
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
You are given a palindromic string s of length n. You have to count the number of indices i (1 ≤ i ≤ n) such that the string after removing si from s still remains a palindrome.
Input
The first line of the input consists of an integer n. The next line consists of a string s.

Constraints
2 ≤ n ≤ 105
s is a palindromic string
Output
Print a single integer — the number of indices i (1 ≤ i ≤ n) such that the string after removing si from s still remains a palindrome.
ai_logoNEWTON AI
BETA
Simpler Explanation
Concepts Used
Example
Sample Input 1
3
aba
Sample Output 1
1

Sample Input 1
8
acaaaaca
Sample Output 1
4
 */
