package Question_Of_The_Day;
import java.util.*;
public class All_At_Once {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            sum += a[i];
        }
        boolean possible = false;
        for (int i = 0; i < n; i++) {
            if ((sum - a[i]) % (n - 1) == 0 && (sum - a[i]) / (n - 1) == a[i]) {
                possible = true;
                break;
            }
        }
        System.out.println(possible ? "Yes" : "No");
    }
}


/*
All At Once
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
You are given an array of n integers a1, a2, …, an. After you watched the amazing film "All At Once", you came up with the following operation. In one operation, you choose n−1 elements of the array and replace each of them with their arithmetic mean (which doesn't have to be an integer). For example, from the array [1, 2, 3, 1] we can get the array [2, 2, 2, 1], if we choose the first three elements, or we can get the array [43, 43, 3, 43], if we choose all elements except the third.
Is it possible to make all elements of the array equal by performing a finite number of such operations?
Input
The first line of the input consists of an integer n. The second line of the input consists of n space- separated integers.

Constraints
3 ≤ n ≤ 50
0 ≤ ai ≤ 100
Output
If it is possible to make all elements equal after some number of operations, output Yes. Otherwise, output No.
ai_logoNEWTON AI
BETA
Simpler Explanation
Concepts Used
Example
Sample Input 1
3
42 42 42
Sample Output 1
Yes

Sample Input 1
3
24 2 22
Sample Output 1
No
 */
