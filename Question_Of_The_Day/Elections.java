package Question_Of_The_Day;
import java.util.*;
public class Elections {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println(Math.max(0,Math.max(b,c)+1-a) + " "+Math.max(0,Math.max(a,c)+1-b) + " "+Math.max(0,Math.max(a,b)+1-c));
    }
}


/*
Elections
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
The elections in which three candidates participated have recently ended. The first candidate received a votes, the second one received b votes, the third one received c votes. For each candidate, solve the following problem: how many votes should be added to this candidate so that he wins the election (i. e. the number of votes for this candidate was strictly greater than the number of votes for any other candidate)?
Input
The input consists of three space- separated integers a, b and c.

Constraints
0 ≤ a, b, c ≤ 109
Output
Print three space- separated integers denoting the answers to the problem for the first, second, and third candidate, respectively.
ai_logoAI CODELENS
BETA
Simpler Explanation
Concepts Used
Example
Sample Input 1
0 0 0
Sample Output 1
1 1 1

Sample Input 2
10 75 15
Sample Output 2
66 0 61
 */
