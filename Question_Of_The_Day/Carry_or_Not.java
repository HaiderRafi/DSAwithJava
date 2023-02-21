package Question_Of_The_Day;

import java.util.Scanner;

public class Carry_or_Not {
    public static void main (String[] args) {
        // Your code here
        // Scanner sc= new Scanner(System.in);
        // long a=sc.nextLong();
        // long b=sc.nextLong();

        // long z=a+b;
        // // System.out.println(z);

        // if(z%3==0){
        //     System.out.println("Easy");
        // }
        // else{
        //     System.out.println("Hard");
        // }

//x----------x-----------x-----------x-------------x-----------x--------
        // String x="28558";
        // String y="28";
        // // int count=0;
        // for(int i=0;i<x.length();i++){
        //     System.out.print(x.charAt(i)+ " ");

        // }

        // for(int j=0;j<y.length();j++){
        //         System.out.print(y.charAt(j)+" ");
        //     }

        //     System.out.println(y.charAt(j));

//x----------x-----------x-----------x-------------x-----------x--------
        Scanner sc= new Scanner(System.in);
        long a=sc.nextLong();
        long b=sc.nextLong();

        while(a!=0&&b!=0){
            if(a%10+b%10>=10){
                System.out.println("Hard");
                System.exit(0);
            }
            a/=10;
            b/=10;
        }
        System.out.println("Easy");
    }
}


/*
Carry or Not?
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
You are given positive integers A and B.
Let us calculate A+B (in decimal). If it does not involve a carry, print Easy; if it does, print Hard.
Input
The input contains two space separated numbers:
A B

Constraints
A and B are integers.
1 ≤ A, B ≤ 10^18
Output
If the calculation does not involve a carry, print Easy; if it does, print Hard.
Example
Sample Input 1
229 390
Sample Output 1
Hard

Sample Input 2
123456789 9876543210
Sample Output 2
Easy
 */
