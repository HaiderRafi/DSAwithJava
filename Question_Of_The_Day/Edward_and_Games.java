package Question_Of_The_Day;
import java.util.*;
public class Edward_and_Games {
    public static void main (String[] args) {
        // Your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int moves = getMoves(n, m);
        System.out.println(moves);
    }

    private static int getMoves(int n, int m) {
        if (m % n != 0) {
            return -1;
        }

        int moves = 0;
        int factor = m / n;

        while (factor % 2 == 0) {
            factor /= 2;
            moves++;
        }

        while (factor % 3 == 0) {
            factor /= 3;
            moves++;
        }

        if (factor != 1) {
            return -1;
        }

        return moves;
    }
}


/*
Edward and Games
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Edward plays "Game 23". Initially, he has a number n and his goal is to transform it into m. In one move, he can multiply n by 2 or multiply n by 3. He can perform any number of moves. Print the number of moves needed to transform n to m. Print -1 if it is impossible to do so.
Input
The input consists of two space- separated integers n and m.

Constraints
1 ≤ n ≤ m ≤ 5⋅108
Output
Print the number of moves to transform n to m, or -1 if there is no solution.
Example
Sample Input 1
120 51840
Sample Output 1
7

Sample Input 2
48 72
Sample Output 2
-1
 */
