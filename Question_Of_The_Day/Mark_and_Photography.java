package Question_Of_The_Day;
import java.util.*;
public class Mark_and_Photography {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = sc.nextInt();
        List<Integer> v = new ArrayList<>();
        for (int i = 0; i < 2 * n; i++) {
            v.add(sc.nextInt());
        }

        Collections.sort(v);

        boolean hasTallHeight = true;

        for (int i = 0; i < n; i++) {
            if (v.get(n + i) - v.get(i) < x) {
                hasTallHeight = false;
            }
        }

        if (hasTallHeight) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}



/*
Mark and Photography
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Mark is asked to take a group photo of 2n people. The i- th person has height hi units. To do so, he ordered these people into two rows, the front row and the back row, each consisting of n people. However, to ensure that everyone is seen properly, the j- th person of the back row must be at least x units taller than the j- th person of the front row for each j between 1 and n, inclusive.
Help Mark determine if this is possible.
Input
The first line of the input consists of two space- separated integers n and x - the number of people in each row and the minimum difference Mark wants. The second line of the input consists of 2n space separated integers denoting the height of each person in units.

Constraints
1 ≤ n ≤ 100
1 ≤ x ≤ 103
1 ≤ hi ≤ 103
Output
Print "YES" if Mark could arrange people satisfying his condition and "NO" otherwise.
ai_logoAI CODELENS
BETA
Simpler Explanation
Concepts Used
Example
Sample Input 1
3 6
1 3 9 10 12 16
Sample Output 1
Yes

Sample Input 2
3 1
2 5 2 2 2 5
Sample Output 2
No
 */
