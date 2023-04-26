package Question_Of_The_Day;
import java.util.*;
public class Cirno_and_Bits {
    static final int N = 3_00_005;
    static final int MOD = (int)1e9 + 7;
    static int[] p = new int[N];
    static void sol() {
        long x, c1 = 0, c2 = 0, flag = 0;
        Scanner sc = new Scanner(System.in);
        x = sc.nextLong();
        for (int i = 0; i < 63; i++) {
            if((x & (1L << i)) != 0 && c1 == 0) {
                c1 = (1L << i);
            } else if((x & (1L << i)) == 0 && c2 == 0) {
                c2 = (1L << i);
            } else if((x & (1L << i)) != 0 && c1 != 0) {
                flag = 1;
            }
        }
        if(flag == 0) {
            System.out.println(c1 + c2);
        } else {
            System.out.println(c1);
        }
    }
    public static void main(String[] args) {
        sol();
    }
}


/*
Cirno and Bits
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Cirno's perfect bitmasks classroom has just started! Cirno gave her students a positive integer x. As an assignment, her students need to find the minimum positive integer y, which satisfies the following two conditions:
1. x and y>0
2. x xor y>0
Where and is the bitwise AND operation, and xor is the bitwise XOR operation.
Input
The input consists of an integer x.

Constraints
1 ≤ x ≤ 230
Output
Print a single integer — the minimum number of y.
ai_logoAI CODELENS
BETA
Simpler Explanation
Concepts Used
Example
Sample Input 1
1
Sample Output 1
3

Sample Input 1
5
Sample Output 1
1
 */
