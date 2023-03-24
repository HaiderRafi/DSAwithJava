package Question_Of_The_Day;
import java.util.*;
public class Tour_of_Prime_Minister {
    public static void main (String[] args) {
        // Your code here
        Scanner sc=new Scanner(System.in);

        int a=sc.nextInt();
        int b=sc.nextInt();

        int z=a*4;
        int y=b*7;
        System.out.println(z+y);
    }
}



/*
Tour of Prime Minister
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Prime Minister loves to travel with their cabinet ministers.

Prime Minister has X cars that can seat 4 people and Y cars that can seat 7 people each. Determine the maximum number of people that can travel together in these cars.
Input
The first and only line of input contains a number of 4- seaters and 7- seater cars separated by space.

Constraints:
1 <= X, Y <= 100
Output
Print the maximum number of people that can travel with the Prime Minister.
Example
Sample Input:
4 8

Sample Output:
72

Sample Input:
2 3

Sample Output:
29
 */
