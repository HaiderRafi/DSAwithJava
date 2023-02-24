package Question_Of_The_Day;
import java.util.*;
public class Card_Games {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int[] A = new int[5];

        for (int i = 0; i < 5; i++) {
            A[i] = Integer.parseInt(sc.next());
        }

        Arrays.sort(A);

        if (A[0] == A[1] && A[0] == A[2] && A[3] == A[4]) {
            System.out.println("Yes");
        } else if (A[0] == A[1] && A[2] == A[3] && A[2] == A[4]) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}





/*
Card Games
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
We have five cards with integers A, B, C, D, and E written on them, one on each card.

This set of five cards is called a Full house if and only if the following below condition is satisfied:
1. Any three cards with the same number written on them
2. Rest two cards with the same numbers written on them.

Determine whether the set is a Full house.
Input
The input consists of 5 space separated integers.
A B C D E

Constraints
1≤A, B, C, D, E≤13
Not all of A, B, C, D, and E are the same.
All values in input are integers.
Output
If the set is a Full house, print Yes; otherwise, print No.
Example
Sample Input 1
1 2 1 2 1
Sample Output 1
Yes

Sample Input 2
12 12 11 1 2
Sample Output 2
No
 */
