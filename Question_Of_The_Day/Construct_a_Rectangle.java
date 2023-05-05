package Question_Of_The_Day;
import java.util.*;
public class Construct_a_Rectangle {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c;

        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();

        if((a==b && c%2==0)||(c==b && a%2==0)||(a==c && b%2==0)) {
            System.out.println("Yes");
        }
        else if((a+b==c)||(c+b==a)||(a+c==b)) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }

        input.close();
    }
}



/*
Construct a Rectangle
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
There are three sticks with integer lengths l1, l2 and l3. You are asked to break exactly one of them into two pieces in such a way that:
- both pieces have positive (strictly greater than 0) integer length;
- the total length of the pieces is equal to the original length of the stick;
- it's possible to construct a rectangle from the resulting four sticks such that each stick is used as exactly one of its sides. A square is also considered a rectangle.
Determine if it's possible to do that.
Input
The input consists of 3 space- separated integers l1, l2 and l3.

Constraints
1 ≤ li ≤ 108
Output
Print "Yes" if it's possible to break one of the sticks into two pieces with positive integer length in such a way that it's possible to construct a rectangle from the resulting four sticks. Otherwise, print "No".
ai_logoAI CODELENS
BETA
Simpler Explanation
Concepts Used
Example
Sample Input 1
6 1 5
Sample Output 1
Yes

Sample Input 2
2 5 2
Sample Output 2
No
 */

