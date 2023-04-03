package Question_Of_The_Day;
import java.util.*;
public class Construct_Strings {
    public static void main (String[] args) {
        // Your code here
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        String b=sc.next();

        // if(b.contains(a)){
        //     System.out.println("Yes");
        // }else{
        //     System.out.println("No");
        // }
        boolean canConstruct = true;
        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            int index = b.indexOf(c);
            if (index == -1) {
                canConstruct = false;
                break;
            }
            b = b.substring(0, index) + b.substring(index + 1);
        }
        System.out.println(canConstruct ? "Yes" : "No");
    }
}

/*
Construct Strings
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
You are given two strings A and B. You need to check if string A can be constructed from string B. Print Yes if it can be constructed else print No.
Input
The input consists of two space- separated integers A and B.

Constraints
The length of A is lesser than or equal to the length of B.
The strings consist of lower case English alphabets.
Output
Print Yes if A can be constructed from B else print No.
ai_logoASK NEWTON AI
BETA
Simpler Explanation
Concepts Used
Example
Sample Input 1
a b
Sample Output 1
No

Sample Input 2
aa aab
Sample Output 2
Yes
 */
