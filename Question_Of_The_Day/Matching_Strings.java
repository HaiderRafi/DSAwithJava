package Question_Of_The_Day;

import java.util.Scanner;

public class Matching_Strings {
    public static void main (String[] args) {
        // Your code here
        Scanner sc= new Scanner(System.in);
        String a= sc.next();
        String b=sc.next();

        if(a.equals(b)){
            System.out.println("Yes");
            return;
        }
        for(int i=0;i<a.length()-1;i++){
            char[] ch=a.toCharArray();
            char temp=ch[i];
            ch[i]=ch[i+1];
            ch[i+1]=temp;
            if(b.equals(String.valueOf(ch))){
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }
}

/*
Matching Strings
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
You are given two strings S and T. Determine whether it is possible to make S and T equal by doing the following operation at most once:
Choose two adjacent characters in S and swap them.
Note that it is allowed to choose not to do the operation.
Input
The input line contains two strings in separate lines.

Constraints
Each of S and T is a string of length between 2 and 100 (inclusive) consisting of lowercase English letters.
S and T have the same length.
Output
If it is possible to make S and T equal by doing the operation in Problem Statement at most once, print Yes; otherwise, print No.
Example
Sample Input 1
abc
acb

Sample Output 1
Yes

Sample Input 2
aabb
bbaa

Sample Output 2
No

Sample Input 3
abcde
abcde

Sample Output 3
Yes
 */
