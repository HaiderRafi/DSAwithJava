package Question_Of_The_Day;
import java.util.*;
public class Minimum_Coins {
    public static void main (String[] args) {
        // Your code here
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a == 0){
            System.out.println(1);
        }
        if(a>0){
            int ans=a+(2*b)+1;
            System.out.println(ans);
        }
    }
}



/*
Minimum Coins
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Vasya decided to go to the grocery store. He found in his wallet coins of 1 burl and b coins of 2 burls. He does not yet know the total cost of all goods, so help him find out s (s>0): the minimum positive integer amount of money he cannot pay without change or pay at all using only his coins.
Input
The input consists of two space- separated integers a and b denoting the number of 1- burle coins and 2- burles coins Vasya has respectively.

Constraints
0 ≤ ai, bi ≤ 108
Output
Print one integer s (s>0): the minimum positive integer amount of money that Vasya cannot pay without change or pay at all.
ai_logoNEWTON AI
BETA
Simpler Explanation
Concepts Used
Example
Sample Input 1
1 1
Sample Output 1
4

Sample Input 1
0 2
Sample Output 1
1
 */
