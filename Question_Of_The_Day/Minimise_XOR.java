package Question_Of_The_Day;
import java.util.*;
public class Minimise_XOR {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] values = new int[n];
        for (int i = 0; i < n; i++) {
            values[i] = sc.nextInt();
        }
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < (1 << n); i++) {
            int current = 0;
            for (int j = 0; j < n; j++) {
                current |= values[j];
                if ((i & (1 << j)) > 0) {
                    stack.push(current);
                    current = 0;
                }
            }
            while (stack.size() > 0) {
                current ^= stack.pop();
            }
            ans = Math.min(ans,current);
        }
        System.out.println(ans);
    }
}


/*
Minimise XOR
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given is a number sequence A of length N. Let us divide this sequence into one or more non-empty contiguous intervals. Then, for each of these intervals, let us compute the bitwise OR of the numbers in it.
Find the minimum possible value of the bitwise XOR of the values obtained in this way.
Input
The first line of the input consists of an integer N. The second line of the input consists of N space-separated integers.
N
A1 A2. . AN

Constraints
1 ≤ N ≤ 20
0 ≤ Ai < 2^30
All values in the input are integers.
Output
Print the answer.
Example
Sample Input 1
3
1 5 7
Sample Output 1
2

Sample Input 2
3
10 10 10
Sample Output 2
0

Sample Input 3
4
1 3 3 1
Sample Output 3
0
 */
