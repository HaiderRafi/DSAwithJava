package Question_Of_The_Day;

import java.util.Scanner;

public class Sum_Modulo {
    public static void main (String[] args) {
        // Your code here
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();

        if(n%sums(n)==0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
    static long sums(int n){

        long sum=0;

        while(n!=0){
            sum += n % 10;
            n /= 10;
        }

        return sum;
    }
}






/*
Sum Modulo
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Let S(n) denote the sum of the digits in the decimal notation of n. For example, S(101)=1+0+1=2.
Given an integer N, determine if S(N) divides N.
Input
The input consists of a single integer.
N

Constraints
1≤N≤10^9
Output
If S(N) divides N, print Yes; if it does not, print No.
Example
Sample Input 1
12
Sample Output 1
Yes

Sample Input 2
101
Sample Output 2
No

Sample Input 3
999999999
Sample Output 3
Yes
 */