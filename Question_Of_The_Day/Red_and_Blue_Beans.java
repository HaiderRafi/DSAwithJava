package Question_Of_The_Day;
import java.util.*;
public class Red_and_Blue_Beans {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        long r = sc.nextLong();
        long b = sc.nextLong();
        long d = sc.nextLong();
        if (Math.abs(r - b) <= d * Math.min(r, b)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}



/*
Red and Blue Beans
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
You have r red and b blue beans. You'd like to distribute them among several (maybe, one) packets in such a way that each packet:
1. Has at least one red bean (or the number of red beans ri ≤ 1);
2. Has at least one blue bean (or the number of blue beans bi ≤ 1);
3. The number of red and blue beans should differ in no more than d (or |ri−bi| ≤ d)
Can you distribute all beans?
Input
The input consists of three space- separated integers r, b, and d — the number of red and blue beans and the maximum absolute difference in each packet.

Constraints
1 ≤ r, b ≤109
0 ≤ d ≤109
Output
If you can distribute all beans, print Yes. Otherwise, print No.
ai_logoASK NEWTON AI
BETA
Simpler Explanation
Concepts Used
Example
Sample Input 1
1 1 0
Sample Output 1
Yes

Sample Input 2
6 1 4
Sample Output 2
No
 */
