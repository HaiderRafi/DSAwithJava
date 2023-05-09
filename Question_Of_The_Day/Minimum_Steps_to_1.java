package Question_Of_The_Day;
import java.util.*;
public class Minimum_Steps_to_1 {
    public static void main (String[] args) {
        // Your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int count = 0;
        while (n != 1) {
            if (n % 6 == 0) {
                n /= 6;
            } else if (n % 3 == 0) {
                n *= 2;
            } else {
                count = -1;
                break;
            }
            count++;
        }

        System.out.println(count);
    }
}


/*
Minimum Steps to 1
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
You are given an integer n. In one move, you can either multiply n by two or divide n by 6 (if it is divisible by 6 without the remainder). Your task is to find the minimum number of moves needed to obtain 1 from n or determine if it's impossible to do that.
Input
The input consists of an integer n.

Constraints
1 ≤ n ≤ 109
Output
Print the answer — the minimum number of moves needed to obtain 1 from n if it's possible to do that or -1 if it's impossible to obtain 1 from n.
Example
Sample Input 1
12
Sample Output 1
-1

Sample Input 2
3
Sample Output 2
2
 */
