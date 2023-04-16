package Question_Of_The_Day;
import java.util.*;
public class Locate_the_Grassopher {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long n = sc.nextLong();
        long w = 0;
        long y = n % 4;
        if (y == 1) {
            w = -n;
        } else if (y == 2) {
            w = 1;
        } else if (y == 3) {
            w = n + 1;
        }
        if (x % 2 == 0) {
            System.out.println(x + w);
        } else {
            System.out.println(x - w);
        }
    }
}



/*
Locate the Grassopher
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
The grasshopper is located on the numeric axis at the point with coordinate x0. Having nothing else to do he starts jumping between integer points on the axis. Making a jump from a point with coordinate x with a distance d to the left moves the grasshopper to a point with a coordinate x−d, while jumping to the right moves him to a point with a coordinate x+d. The grasshopper is very fond of positive integers, so for each integer, i starting with 1 the following holds: exactly I minute after the start he makes a jump with a distance of exactly i. So, in the first minutes, he jumps by 1, then by 2, and so on.
The direction of a jump is determined as follows: if the point where the grasshopper was before the jump has an even coordinate, the grasshopper jumps to the left, otherwise he jumps to the right.
Find exactly which point the grasshopper will be at after exactly n jumps.
Input
The input consists of two space- separated integers x0 and n denoting the coordinate of the grasshopper's initial position and the number of jumps.

Constraints
−1014 ≤ x0 ≤ 1014
0 ≤ n ≤ 1014
Output
Print the coordinate of the point the grasshopper will be at after making n jumps from the point x0.
ai_logoNEWTON AI
BETA
Simpler Explanation
Concepts Used
Example
Sample Input 1
0 1
Sample Output 1
-1

Sample Input 2
10 10
Sample Output 2
11
 */
