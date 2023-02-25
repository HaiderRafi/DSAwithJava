package Assignments;
import java.util.*;
public class Super_Exponentation {
    static long powerMod(long x, long y,long m){

        long ans=1;
        if(x==0 && y!=0)
            return 0;
        x=x%m;
        while(y>0){
            if(y%2!=0){
                // ans=(ans*x)%m;
                ans=((ans%m)*(x%m))%m;
            }
            y=y/2;
            x=((x%m)*(x%m))%m;
        }
        return ans;

    }
    public static void main (String[] args) {
        // Your code here
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int m=1000000007;
        while(t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            long x=powerMod(b,c,m-1);
            // System.out.println(powerMod(a,powerMod(b,c.m-1),m));
            System.out.println(powerMod(a,x,m));
        }
    }
}


/*
Super-Exponentation
medium
hint
Hint

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Modulo exponentiation is super awesome. But can you still think of a solution to the following problem?
Given three integers {a, b, c}, find the value of abc % 1000000007.
Here ab means a raised to the power b or pow(a, b). Expression evaluates to pow(a, pow(b, c)) % 1000000007.

(Read Euler's Theorem before solving this problem)
Input
The first input line has an integer t: the number of test cases.
After this, there are n lines, each containing three integers a, b and c.


Constraints
1≤ t ≤ 100
0 ≤ a, b, c ≤ 1000000000
Output
For each test case, output the value corresponding to the expression.
Example
Sample Input
3
3 7 1
15 2 2
3 4 5

Sample Output
2187
50625
763327764

Explaination:
In the first test, a = 3, b = 7, c = 1
bc = 71 = 7
abc = 37 = 2187
 */
