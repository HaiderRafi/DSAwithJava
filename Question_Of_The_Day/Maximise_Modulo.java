package Question_Of_The_Day;
import java.util.*;
public class Maximise_Modulo {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);

        int l = sc.nextInt();
        int r = sc.nextInt();
        if(r/2 < l){
            System.out.println(r%l);
        }
        else{
            System.out.println(r%((r/2)+1));
        }
    }
}



/*
Maximise Modulo
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
You are given two integers l and r, l ≤ r. Find the largest possible value of a mod b over all pairs (a, b) of integers for which r ≥ a ≥ b ≥ l. As a reminder, a mod b is the remainder we get when dividing a by b. For example, 26 mod 8 = 2.
Input
The input consists of two space- separated integers l and r.

Constraints
1 ≤ l ≤ r ≤ 109
Output
Print the largest possible value of a mod b over all pairs (a, b) of integers for which r ≥ a ≥ b ≥ l.
ai_logoAI CODELENS
BETA
Simpler Explanation
Concepts Used
Example
Sample Input 1
1 1
Sample Output 1
0

Sample Input 2
8 26
Sample Output 2
12
 */
