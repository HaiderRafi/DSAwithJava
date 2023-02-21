package Question_Of_The_Day;

import java.util.Scanner;

public class Alexa_and_Digits {
    public static void main (String[] args) {
        // Your code here
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        for(int i=1;i<=9;i++){
            // System.out.println(i);
            for(int j=1;j<=9;j++){
                //    System.out.println(j);
                if(i*j==n){
                    //    System.out.println("Yes");
                    count++;
                }
            }
        }
        if(count>0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}

/*
Alexa and Digits
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Having learned the multiplication table, Alexa can multiply two integers between 1 and 9 (inclusive) together. Given an integer N, determine whether N can be represented as the product of two integers between 1 and 9. If it can, print Yes; if it cannot, print No.
Input
The input consists of a single integer.
N

Constraints
1≤N≤100
Output
If N can be represented as the product of two integers between 1 and 9 (inclusive), print Yes; if it cannot, print No.
Example
Sample Input 1
10
Sample Output 1
Yes

Sample Input 2
50
Sample Output 2
No

Sample Input 3
81
Sample Output 3
Yes

 */
