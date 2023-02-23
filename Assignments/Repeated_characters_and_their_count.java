package Assignments;
import java.util.*;
public class Repeated_characters_and_their_count {
    public static void main (String[] args) {
        // Your code here
        try (Scanner in = new Scanner(System.in)) {
            int n = Integer.parseInt(in.next());
            String s = in.next();

            int a[] = new int[26];
            Arrays.fill(a, 0);

            for (int i = 0; i < n; i++) {
                int j = s.charAt(i) - 'a';
                a[j]++;
            }

            for (int i = 0; i < 26; i++) {
                if (a[i] > 1) {
                    System.out.println((char) ('a' + i) + " " + a[i]);
                }
            }
        }

        System.out.close();
    }
}



/*
Repeated characters and their count
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given a string s of length n. Find all the repeating characters and count their occurrence. A character is a repeating character if it occurs more than once.
Input
First line contains n.
Next line contains the string s.

Constraints
1 ≤ n ≤ 105
s contains only lowercase English letters.
Output
Print all the repeating characters and their frequency. Print in order from 'a' to 'z'.
Example
Input:
6
banana

Output:
a 3
n 2

Explanation :
b occurs only once.
 */
