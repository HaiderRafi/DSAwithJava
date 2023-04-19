package Question_Of_The_Day;
import java.util.*;
public class Fair_Tournament {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int s1 = sc.nextInt();
        int s2 = sc.nextInt();
        int s3 = sc.nextInt();
        int s4 = sc.nextInt();
        int m = Math.max(Math.max(s1, s2), Math.max(s3, s4));
        if(m == s1 && (s2 < s3 || s2 < s4)){
            System.out.println("Yes");
        }
        else if(m == s2 && (s1 < s3 || s1 < s4)){
            System.out.println("Yes");
        }
        else if(m == s3 && (s4 < s1 || s4 < s2)){
            System.out.println("Yes");
        }
        else if(m == s4 && (s3 < s1 || s3 < s2)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}

/*
Fair Tournament?
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Four players participate in the playoff tournament. The tournament is held according to the following scheme:

the first player will play with the second, and

the third player with the fourth, then

the winners of the pairs will play in the finals of the tournament.


It is known that in a match between two players, the one whose skill is greater will win. The skill of the ith player is equal to si and all skill levels are pairwise different (i.e. there are no two identical values in the array s).

The tournament is called fair if the two players with the highest skills meet in the finals. Determine whether the given tournament is fair.
Input
The input consists of 4 space- spearated integers s1, s2, s3, s4.

Constraints
1 ≤ si ≤ 100
Output
Print Yes if the tournament is fair, or No otherwise.
ai_logoNEWTON AI
BETA
Simpler Explanation
Concepts Used
Example
Sample Input 1
3 7 9 5
Sample Output 1
Yes

Sample Input 2
4 5 6 9
Sample Output 2
No
 */
