package Question_Of_The_Day;

import java.util.Scanner;

public class String_Analysis {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if (s.contains("er")) {
            System.out.println("er");
        } else if (s.contains("ist")) {
            System.out.println("ist");
        }
    }
}

/*
String Analysis
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
You are given a string S ending with er or ist.
If S ends with er, print er; if it ends with ist, print ist.
Input
The input consists of a string.
S

Constraints
2≤∣S∣≤20
S consists of lowercase English letters.
S ends with er or ist.
Output
Print the answer.
Example
Sample Input 1
coder
Sample Output 1
er

Sample Input 2
tourist
Sample Output 2
ist

Sample Input 3
er
Sample Output 3
er
*/
