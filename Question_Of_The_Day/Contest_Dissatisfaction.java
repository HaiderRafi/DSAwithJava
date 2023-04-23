package Question_Of_The_Day;
import java.util.*;
import java.io.*;
public class Contest_Dissatisfaction {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) {
        solve();
    }

    public static void solve() {
        long n, x, f;
        try {
            st = new StringTokenizer(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        n = Long.parseLong(st.nextToken());
        x = Long.parseLong(st.nextToken());
        f = Long.parseLong(st.nextToken());

        long ans = 0;
        long window = Math.min(f / x + 1, n);
        if (window == n) {
            ans = (n - 1) * n / 2;
        } else {
            ans += (n - window) * (window - 1);
            ans += (window - 1) * window / 2;
        }
        System.out.println(ans);
    }
}


/*
Contest Dissatisfaction
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
There are n people participating in some contest, they start participating in x minutes intervals. That means the first participant starts at time 0, the second participant starts at time x, the third — at time 2⋅x, and so on. The duration of the contest is t minutes for each participant, so the first participant finishes the contest at time t, the second — at time t+x, and so on. When a participant finishes the contest, their dissatisfaction equals the number of participants that started the game (or starting it now) but haven't yet finished it.
Determine the sum of dissatisfaction of all participants.
Input
The input consists of three space separated integers n, t and x — the number of participants, the start interval and the contest duration.

Constraints
1 ≤ n, x, t ≤ 2⋅109
Output
Print the total dissatisfaction of participants.
ai_logoAI CODELENS
BETA
Simpler Explanation
Concepts Used
Example
Sample Input 1
4 2 5
Sample Output 1
5

Sample Input 2
3 1 2
Sample Output 2
3
 */