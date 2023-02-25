package Assignments;
import java.util.*;
public class Number_of_characters_in_string {
    public static void main (String[] args) {
        // Your code here
        Scanner in= new Scanner(System.in);
        int n=Integer.parseInt(in.next());
        String s=in.next();
        int a[] = new int[26];
        Arrays.fill(a,0);
        for(int i=0;i<n;i++){
            int j=s.charAt(i)-'a';
            a[j] = 1;
        }

        int ans=0;
        for(int i=0;i<26;i++){
            ans+=a[i];
        }
        System.out.print(ans);
    }
}



/*
Number of characters in string
easy
asked in interviews by 1 company
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given a string s of length n, print the number of unique characters in the string.
Input
First line contains n.
Next line contains a string s.

Constraints
1 ≤ n ≤ 105
s contains only lowercase English letters.
Output
A single integer denoting the answer.
Example
Input:
7
amazing

Output:
6

Explanation :
{a, m, z, i, n, g}
 */
