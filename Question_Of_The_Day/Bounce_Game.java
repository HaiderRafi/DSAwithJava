package Question_Of_The_Day;
import java.util.*;
public class Bounce_Game {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();// OK
        int X = sc.nextInt();// OK
        long[] arr = new long[N + 1];
        arr[0] = 0;
        for (int i = 1; i < N + 1; i++) {
            arr[i] = (long) (arr[i - 1] + sc.nextLong());
        }
        // Arrays.stream(arr).forEach(a -> out.println(a));
        int ans = 0;
        for (int i = 0; i < N + 1; i++) {
            if (arr[i] <= X)
                ans++;
            else {
                break;
            }
        }
        System.out.println(ans);
    }
}


/*
Bounce Game
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
A ball will bounce along a number line, making N+1 bounces. It will make the first bounce at coordinate D1 = 0, and the i- th bounce (2≤i≤N+1) at coordinate Di = Di−1 + Li−1. How many times will the ball make a bounce where the coordinate is at most X?
Input
The first line of the input consists of two space-separated integers N and X. The next line consists of N space-separated integers as follows:
N X
L1 L2. . LN

Constraints
1 ≤ N ≤ 100
1 ≤ Li ≤ 100
1 ≤ X ≤ 10000
All values in the input are integers.
Output
Print the number of times the ball will make a bounce where the coordinate is at most X.
ai_logoASK NEWTON AI
BETA
Simpler Explanation
Concepts Used
Example
Sample Input 1
3 6
3 4 5
Sample Output 1
2

Sample Input 2
4 9
3 3 3 3
Sample Output 2
4
 */
