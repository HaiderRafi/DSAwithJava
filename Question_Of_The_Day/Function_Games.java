package Question_Of_The_Day;
import java.util.*;
public class Function_Games {
    public static void main (String[] args) {
        // Your code here
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        //f(t)==x
        int x=((a*a)+(2*a)+3);
        //f(t)+t==int b
        int b = x+a;
        //f(f(t)+t)==f(b)==int c
        int c=((b*b)+(2*b)+3);
        //f(t)==x
        //f(f(t))==f(x)==int d
        int d= ((x*x)+(2*x)+3);
        //f(f(t)+t)+f(f(t))==f(c+d)==f(e)==f(f)
        //c+d=e
        int e=(c+d);
        int f = ((e*e)+(2*e)+3);
        System.out.println(f);
    }
}




/*
Function Games
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Let us define a function f as f(x)=x2+2x+3. Given an integer t, find f(f(f(t)+t)+f(f(t))).
Here, it is guaranteed that the answer is an integer not greater than 2×109.
Input
The input consists of a single integer.

Constraints
t is an integer between 0 and 10 (inclusive).
Output
Print the answer as an integer.
Example
Sample Input 1
0
Sample Output 1
1371

Sample Input 2
3
Sample Output 2
722502
 */
