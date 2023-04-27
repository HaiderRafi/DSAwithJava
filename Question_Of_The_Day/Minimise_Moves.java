package Question_Of_The_Day;
import java.util.*;
public class Minimise_Moves {
    public static void main (String[] args) {
        // Your code here
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long c = scanner.nextLong();
        long d = scanner.nextLong();

        if (b > d) {
            System.out.println(-1);
            return;
        }

        long s = d - b;
        a += s;
        if (a < c) {
            System.out.println(-1);
        } else {
            s += (a - c);
            System.out.println(s);
        }
    }
}


/*
Minimise Moves
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
YunQian is standing on an infinite plane with the Cartesian coordinate system on it. In one move, she can move to the diagonally adjacent point on the top right or the adjacent point on the left. That is, if she is standing on point (x, y), she can either move to point (x+1, y+1) or point (x−1, y). YunQian initially stands at point (a, b) and wants to move to point (c, d). Find the minimum number of moves she needs to make or declare that it is impossible.
Input
The input consists of 4 space- separated integers a, b, c and d.

Constraints
−108 ≤ a, b, c, d ≤ 108
Output
if it is possible to move from point (a, b) to point (c, d), output the minimum number of moves. Otherwise, output −1.
ai_logoAI CODELENS
BETA
Simpler Explanation
Concepts Used
Example
Sample Input 1
-1 0 -1 2
Sample Output 1
4

Sample Input 2
0 0 4 5
Sample Output 2
6
 */
