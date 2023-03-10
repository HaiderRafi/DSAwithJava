package Question_Of_The_Day;
import java.util.*;
public class Logic_Squares {
    public static void main (String[] args) {
        // Your code here
        Scanner sc=new Scanner(System.in);
        String S= sc.next();

        System.out.print(0);
        System.out.print(S.charAt(0));
        System.out.print(S.charAt(1));
        System.out.print(S.charAt(2));


        //this is also an method to print index 0 to 5
        // System.out.print(S.substring(0,5));
    }
}




/*
Logic Squares
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
There are 4 squares lined up horizontally. You are given a string S of length 4 consisting of 0 and 1.
If the ith character of S is 1, there is a person in the ith square from the left; if the ith character of
S is 0, there is no person in the ith square from the left.
Now, everyone will move to the next square to the right simultaneously. With this move, the person who was originally in the rightmost square will disappear. Determine if there will be a person in each square after the move. Print the result as a string in the same format as S. (See also Sample Input/Output for clarity.)
Input
The input consists of a single string.

Constraints
S is a string of length 4 consisting of 0 and 1.
Output
Print a string of length 4 such that the i- th character is 1 if there will be a person in the i- th square from the left after the move, and 0 otherwise.
Example
Sample Input 1
1011
Sample Output 1
0101

Sample Input 2
0000
Sample Output 2
0000

Sample Input 3
1111
Sample Output 3
0111
 */
