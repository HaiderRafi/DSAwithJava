package Question_Of_The_Day;

import java.util.Scanner;

public class Alexa_and_Balls {
    public static int min(int a, int b, int c, int d) {
        long l = 0;
        long r = 1000000000;
        while(l < r) {
            long m = (l + r) / 2;
            if (a + m * b <= m * c * d) {
                r = m;
            } else {
                l = m + 1;
            }
        }

        if(a + l * b <= l * c * d) {
            return (int) l;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        System.out.println(min(a, b, c, d));
    }
}


/*
Alexa and Balls
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
There is a container with A cyan balls. Alexa will do the following operation as many times as he likes (possibly zero times):
Add B cyan balls and C red balls into the container.
Alexa's objective is to reach a situation where the number of cyan balls in the container is at most D times the number of red balls in it.

Determine whether the objective is achievable. If it is achievable, find the minimum number of operations needed to achieve it.
Input
The input contains 4 space-separated numbers:
A B C D

Constraints
1 ≤ A, B, C, D ≤ 105

All values in the input are integers.
Output
If Alexa's objective is achievable, print the minimum number of operations needed to achieve it. Otherwise, print -1.
Example
Sample Input 1
5 2 3 2
Sample Output 1
2

Sample Input 2
6 9 2 3
Sample Output 2
-1
 */
