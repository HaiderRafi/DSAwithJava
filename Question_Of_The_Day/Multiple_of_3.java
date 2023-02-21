package Question_Of_The_Day;

import java.util.Scanner;

public class Multiple_of_3 {
    public static void main (String[] args) {
        // Your code here
        // Scanner sc= new Scanner(System.in);
        // long n=sc.nextLong();

        // if(n%3==0){
        //     System.out.println(0);
        //     return;
        // } else if(n==11||n==22||n==44||n==55||n==58||n==1||n==2||n==4||n==5||n==7||n==8){
        //     System.out.println(-1);
        //     return;
        // }
        // else if(n%3!=0){
        //     System.out.println(1);
        // }
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int ans = multipleOf3(n);
        System.out.println(ans);
    }
    static int multipleOf3(long n) {
        String str = Long.toString(n);
        int sumOfDigits = 0;
        for (int i = 0; i < str.length(); i++) {
            sumOfDigits += (str.charAt(i) - '0');
        }
        if (sumOfDigits % 3 == 0) {
            return 0;
        }
        for (int i = 0; i < str.length(); i++) {
            if ((sumOfDigits - (str.charAt(i) - '0')) % 3 == 0) {
                return 1;
            }
        }
        return -1;
    }
}

/*
Multiple of 3
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given is a positive integer N, where none of the digits is 0. Let k be the number of digits in N. We want to make a multiple of 3 by erasing at least 0 and at most k−1 digits from N and concatenating the remaining digits without changing the order. Determine whether it is possible to make a multiple of 3 in this way. If it is possible, find the minimum number of digits that must be erased to make such a number.
Input
The input consists of a single integer N.

Constraints
1≤N≤10^18

None of the digits in N is 0.
Output
If it is impossible to make a multiple of 3, print -1; otherwise, print the minimum number of digits that must be erased to make such a number.
Example
Sample Input 1
35
Sample Output 1
1

Sample Input 2
369
Sample Output 2
0

Sample Input 3
6227384
Sample Output 3
1

Sample Input 4
11
Sample Output 4
-1
 */
