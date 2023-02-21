package Question_Of_The_Day;

import java.util.Scanner;

public class Minimum_Replacements {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String T = sc.next();
        char[] s = new char[S.length()];
        char[] t = new char[T.length()];
        for (int i = 0; i < s.length; i++) {
            s[i] = S.charAt(i);
        }
        for (int i = 0; i < t.length; i++) {
            t[i] = T.charAt(i);
        }
        int min = 0;
        for (int i = 0; i < s.length-t.length+1; i++) {
            int count = 0;
            for (int j = 0; j < t.length; j++) {
                if (s[i+j] == t[j]) {
                    count++;
                }
            }
            if (i==0) {
                min = t.length-count;
            }
            if (min>t.length-count) {
                min = t.length-count;
            }
        }
        System.out.println(min);
    }
}


/*
Minimum Replacements
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given are two strings S and T.
Let us change some of the characters in S so that T will be a substring of S.
At least how many characters do we need to change?

Here, a substring is a consecutive subsequence. For example, xxx is a substring of yxxxy, but not a substring of xxyxx.
Input
The input consists of two strings separated by a line.
S
T

Constraints
1 <= |S|, |T| <= 1000
S and T consist of lowercase English letters.
Output
Print the minimum number of characters in S that need to be changed.
Example
Sample Input 1
cabacc
abc
Sample Output 1
1

Sample Input 2
codeforces
atcoder
Sample Output 2
6
 */
