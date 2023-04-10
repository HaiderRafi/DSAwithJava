package Question_Of_The_Day;
import java.util.*;
public class Special_Attacks {
    public static void main (String[] args) {
        // Your code here
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

        int count=0;
        for(int i=1;i<=b;i++){
            if(a*i<=b){
                count++;
            }
        }
        System.out.println(count);
    }
}



/*
Special Attacks
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Yash is playing a mobile game. In the game, Yash can perform special attacks. However, one special attack costs X mana points to Yash.
If Yash currently has Y mana points, determine the maximum number of special attacks he can perform.
Input
The first and only line of each test case contains two space- separated integers X and Y - the cost of one special attack and the number of mana points Yash has initially.

Constraints
1 ≤ X ≤ 100
1 ≤ Y ≤ 1000
Output
For each test case, output the maximum number of special attacks Yash can perform.
ai_logoNEWTON AI
BETA
Simpler Explanation
Concepts Used
Example
Sample Input:
10 30

Sample Output:
3

Sample Input:
6 41

Sample Output:
6
 */
