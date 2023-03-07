package Question_Of_The_Day;
import java.util.*;
public class Spinning_Slots {
    public static void main (String[] args) {
        // Your code here
        Scanner sc= new Scanner(System.in);
        String S=sc.next();

        for(int i=0;i<S.length();i++){
            // System.out.println(S.charAt(i));
            if(S.charAt(0)==S.charAt(1)&& S.charAt(1)==S.charAt(2)){
                System.out.println("Won");
                break;
            }else{
                System.out.println("Lost");
                break;
            }
        }
    }
}



/*
Spinning Slots
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Edward is playing the slots. The result of a spin is represented by three uppercase English letters
C1, C2, and C3. It is considered a win when all of them are the same letter.
Determine whether Edward will win or not.
Input
The input consists of a string S.

Constraints
S consists of 3 characters all of which are uppercase English letters.
Output
If the result is a win, print Won; otherwise, print Lost.
Example
Sample Input 1
SSS
Sample Output 1
Won

Sample Input 2
WVW
Sample Output 2
Lost
 */



