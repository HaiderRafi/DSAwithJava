package Question_Of_The_Day;
import java.util.*; // contains Collections framework
import java.util.stream.IntStream;
public class Minimize_Stamina {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        for (int i = 0; i < n; i++){
            x[i] = sc.nextInt();
        }
        sc.close();

        int avg = (int) Math.round(IntStream.of(x).average().getAsDouble());

        int ans = 0;
        for (int i : x) {
            ans += Math.pow(i - avg, 2);
        }
        System.out.println(ans);
    }
}


//copied from atcoder
/*
Minimize Stamina
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
There are N people living on a number line. I-th person lives at coordinate Xi​. You are going to hold a meeting that all N people have to attend. The meeting can be held at any integer coordinate. If you choose to hold the meeting at coordinate P, the i- th person will spend (Xi − P)2 points of stamina to attend the meeting.
Find the minimum total points of stamina the N people have to spend.
Input
The first line of the input consists of an integer N. The second line consists of N space separated integers denoting the co- ordinate where the people live.

Constraints
All values in input are integers.
1 ≤ N ≤ 100
1 ≤ Xi ≤ 100
Output
Print the minimum total stamina the N people have to spend.
starsASK AI
BETA
Simpler Explanation
Concepts Used
Example
Sample Input 1
2
1 4
Sample Output 1
5

Sample Input 2
7
14 14 2 13 56 2 37
Sample Output 2
2354
 */
