package Question_Of_The_Day;
import java.util.*;
public class Integer_Games {
    public static void main (String[] args) {
        // Your code here
        Scanner scan = new Scanner(System.in);
        long N = scan.nextLong();

        long t = (long) Math.sqrt(N);
        Set<Long> set = new HashSet<>();
        for(long i = 2; i <= t; i++){
            long k = 2;
            while(Math.pow(i, k) <= N){
                double l = Math.pow(i,k);
                set.add((long) l);
                k++;
            }
        }
        System.out.println(N - set.size());
    }
}




/*
Integer Games
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given is an integer N. How many integers between 1 and N (inclusive) are unrepresentable as ab, where a and b are integers not less than 2?
Input
The input consists of a single integer N.

Constraints
N is an integer.
1 ≤ N ≤ 1010
Output
Print the answer.
starsASK AI
BETA
Simpler Explanation
Concepts Used
Example
Sample Input 1
8
Sample Output 1
6

Sample Input 2
100000
Sample Output 2
99634
 */
