package Question_Of_The_Day;
import java.util.*;
public class Palindromic_String {
    public static void main (String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.next();
        int n=s.length();
        int l=0;
        int r=n-1;
        while(l<r&&s.charAt(l)=='a'&&s.charAt(r)=='a') {
            l++;
            r--;
        }
        while(l<r&&s.charAt(r)=='a')r--;
        while(l<r&&s.charAt(l)==s.charAt(r)) {
            l++;
            r--;
        }
        if(l>=r) {
            System.out.println("Yes");
            return;
        }else {
            System.out.println("No");
            return;
        }
    }
}




/*
Palindromic String
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
You are given a string S consisting of lowercase English letters. Determine whether adding some number of a's (possibly zero) at the beginning of S can make it a palindrome.
Input
The input consists of a single string S.

Constraints
1 ≤ ∣S∣ ≤ 10^6
S consists of lowercase English letters.
Output
If adding some number of a's (possibly zero) at the beginning of S can make it a palindrome, print Yes; otherwise, print No.
Example
Sample Input 1
kasaka
Sample Output 1
Yes

Sample Input 2
reveh
Sample Output 2
No
 */
