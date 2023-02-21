package Question_Of_The_Day;

import java.util.Scanner;

public class Shifted_String {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = (char) ((s.charAt(i) - 'A' + n) % 26 + 'A');
            sb.append(c);
        }
        System.out.println(sb.toString());
        sc.close();
    }
}


/*
Shifted String
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
We have a string S consisting of uppercase English letters. Additionally, an integer N will be given.
Shift each character of S by N in alphabetical order (see below), and print the resulting string.

We assume that A follows Z. For example, shifting A by 2 results in C (A → B → C), and shifting Y by 3 results in B (Y → Z → A → B).
Input
The input contains a number and a string separated by a new line.

N
S
Output
Print the string resulting from shifting each character of S by N in alphabetical order
Example
Sample Input 1
2
ABCXYZ
Sample Output 1
CDEZAB

Sample Input 2
0
ABCXYZ
Sample Output 2
ABCXYZ

Sample Input 3
13
ABCDEFGHIJKLMNOPQRSTUVWXYZ
Sample Output 3
NOPQRSTUVWXYZABCDEFGHIJKLM
 */
