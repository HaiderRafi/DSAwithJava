package Question_Of_The_Day;

import java.util.Scanner;

public class Unlucky_Seven {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int N = sc.nextInt();
        int count = 0;
        for (int i = 1; i <= N; i++) {
            if (!Integer.toString(i).contains("7") && !Integer.toOctalString(i).contains("7")) {
                count++;
            }
        }
        System.out.println(count);
    }
}

/*
Unlucky Seven
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Mahi hates the number 7.

We are interested in integers without the digit 7 in both decimal and octal. How many such integers are there between 1 and N (inclusive)?
Input
Input is given from Standard Input in the following format:
N

Constraints
1≤N≤10^5

N is an integer.
Output
Print an integer representing the answer.
Example
Sample Input 1
20
Sample Output 1
17
Sample Input 2
100000
Sample Output 2
30555

Note: Octal number system has base 8 instead of 10.
 */
