package Question_Of_The_Day;

import java.util.Scanner;

public class End_Card {
    public static void main (String[] args) {
        // Your code here
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(a-b+1);
    }
}

/*
End Card
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
You are given N cards and an integer i.

Find an integer j such that the i- th card from the top of the deck is the j- th card from the bottom of the deck.
Input
The first and only line of the input contains 2 integers, N and i

Constraints:
1 ≤ i ≤ N ≤ 105
Output
Print the answer
Example
Sample Input 1:
5 3

Sample Output 1:
3

Explanation:
The third card from the top is also the third card from the end


Sample Input 2:
3 1

Sample Output 2:
3
 */
