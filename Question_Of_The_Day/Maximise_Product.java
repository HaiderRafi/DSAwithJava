package Question_Of_The_Day;

import java.util.Scanner;

public class Maximise_Product {
    public static void main (String[] args) {
        // Your code here
        Scanner sc= new Scanner(System.in);
        long a=sc.nextLong();
        long b=sc.nextLong();
        long c=sc.nextLong();
        long d=sc.nextLong();

        long x=a*d;
        long y=b*c;

        long h=Math.max(x,y);
        // System.out.println(h);

        long w=a*c;
        long p=b*d;

        long r=Math.max(w,p);

        System.out.println(Math.max(h,r));

    }
}
/*
Maximise Product
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given are integers a, b, c, and d. If x and y are integers and a≤x≤b and c≤y≤d hold, what is the maximum possible value of x*y?
Input
The input consists of four space-separated integers.
a b c d

Constraints
−10^9≤a≤b≤10^9
−10^9≤c≤d≤10^9

All values in the input are integers.
Output
Print the maximum product.
Example
Sample Input 1
1 2 1 1
Sample Output 1
2

Sample Input 2
3 5 -4 -2
Sample Output 2
-6

Sample Input 3
-1000000000 0 -1000000000 0
Sample Output 3
1000000000000000000
 */
