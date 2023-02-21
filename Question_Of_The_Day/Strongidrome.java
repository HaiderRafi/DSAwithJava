package Question_Of_The_Day;

import java.util.Scanner;

public class Strongidrome {
    public static void main (String[] args) {
        // Your code here
        Scanner scn = new Scanner(System.in);
        String s = scn.next();

// Case 0. Odd length
        if(s.length() % 2 == 0){
            System.out.println("No");
            return;
        }

        int N = s.length();

// Case 1. Complete string check
        if(!isPalindrome(s)){
            System.out.println("No");
            return;
        }

// case 2. 1st -> (N-1)/2
        if(!isPalindrome(s.substring(0, (N-1)/2))){
            System.out.println("No");
            return;
        }

// case 3. (N+3)/2 to Nth
        if(!isPalindrome(s.substring((N+3)/2-1, N))){
            System.out.println("No");
            return;
        }

        System.out.println("Yes");
    }

    public static boolean isPalindrome(String s){
        int lo = 0;
        int hi = s.length()-1;

        while(lo <= hi){
            if(s.charAt(lo) != s.charAt(hi)){
                return false;
            }
            lo++;
            hi--;
        }

        return true;
    }
}

/*
Strongidrome
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
A string S of an odd length is said to be a strong palindrome if and only if all of the following conditions are satisfied:
1) S is a palindrome.
2) Let N be the length of S. The string formed by the 1- st through ((N−1)/2)th characters of S is a palindrome.
3) The string consisting of the (N+3)/2- st through Nth characters of S is a palindrome.
Determine whether S is a strong palindrome.
Input
The first and the only line of the input contains a single string S.

Constraints:
3 ≤ |S| ≤ 99
Output
If S is a strong palindrome, print "Yes"; otherwise, print "No".
Example
Sample Input 1:
akasaka

Sample Output 1:
Yes

Sample Explanation 1:
1) S is Akasaka.
2) The string formed by the 1st through the 3rd characters is aka.
3) The string formed by the 5th through the 7th characters is aka. All of these are palindromes, so S is a strong palindrome.
 */
