package Question_Of_The_Day;

import java.util.Scanner;

public class Prefix_Strings {
    public static void main (String[] args) {
        // Your code here

        // Scanner sc= new Scanner(System.in);

        // String a=sc.next();
        // String b=sc.next();


        // if(a.charAt(0)==b.charAt(0)&&b.contains(a)){
        //     System.out.println("Yes");

        // }else if(a.length()!=b.length()){
        //     System.out.println("No");
        // }

        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        boolean cond = true;
        if(s.length() > t.length())
        {
            cond = false;
        }
        else
        {
            for(int i =0;i<s.length();i++)
            {
                if(s.charAt(i) != t.charAt(i))
                {
                    cond = false;
                    break;
                }
            }
        }
        if (cond == false)
        {
            System.out.println("No");
        }
        else
        {
            System.out.println("Yes");
        }
    }
}

/*
Prefix Strings
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
You are given two strings S and T consisting of lowercase English letters. Determine if S is a prefix of T.
Input
The input contains two strings separated by a new line.
S
T

Constraints
S and T are strings of lengths between 1 and 100 (inclusive) consisting of lowercase English letters.
Output
Print "Yes" if S is a prefix of T, "No" otherwise.

Note: that the judge is case-sensitive.
Example
Sample Input 1
new
newton
Sample Output 1
Yes

Sample Input 2
ewt
newton
Sample Output 2
No

Sample Input 3
aaaa
aa
Sample Output 3
No
 */
