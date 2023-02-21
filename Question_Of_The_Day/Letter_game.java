package Question_Of_The_Day;

import java.util.Scanner;

public class Letter_game {
    public static void main (String[] args) {
        // Your code here

        Scanner sc= new Scanner(System.in);

        String a= sc.next();

        if(a.charAt(0)==a.charAt(1) && a.charAt(1)==a.charAt(2)){
            System.out.print("Won");

        }else{
            System.out.print("Lost");
        }

    }
}
/*

Letter game
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
There is a room filled with letters. Newton can choose exactly three letters C1, C2 and C3. If all of them are the same letter, then it is considered as a win.
Determine whether Newton wins.
Input
The first line contains three letters C1, C2 and C3.

Constraints
Ci is an uppercase English letter.
Output
If the result is a win, print Won; otherwise, print Lost.
Example
Sample Input 1:
SSS

Sample Output 1:
Won

Sample Explanation 1:
All of them are the same letter, so it is a win.


Sample Input 2:
WVW

Sample Output 2:
Lost

Sample Explanation 2:
It is not a win.
 */
