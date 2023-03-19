package Question_Of_The_Day;
import java.util.*;
public class Concatenated_Square {
    public static void main (String[] args) {
        // Your code here
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        String s1 = Integer.toString(a);
        String s2 = Integer.toString(b);

        String s = s1 + s2;

        int c = Integer.parseInt(s);

        double x = Math.sqrt(c);

        if(x == (int)x){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}


/*
Concatenated Square?
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Alexa found two positive integers, a and b. Determine whether the concatenation of a and b in this order is a square number.
Input
The input consists of two space separated integers a and b.

Constraints
1 ≤ a, b ≤ 100
a and b are integers.
Output
If the concatenation of a and b in this order is a square number, print Yes; otherwise, print No.
Example
Sample Input 1
1 44
Sample Output 1
Yes

Sample Input 2
100 100
Sample Output 2
No

Sample Input 3
12 10
Sample Output 3
No
 */
