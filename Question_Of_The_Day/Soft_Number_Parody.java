package Question_Of_The_Day;
import java.util.*;
public class Soft_Number_Parody {
    public static void main (String[] args) {
        // Your code here
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=0;i<n;i++){
            int number=i*(i+1);
            if(number>n)
                break;

            int result=(int)Math.sqrt(2*n-number);
            result=result*(result+1);

            if(result==2*n-number){
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}



/*
Soft Number Parody
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
An integer A is defined to be a soft integer if it can be represented as K*(K+1)/2 where K is some positive integer. Given an integer N, find if it can be represented as the sum of two soft numbers (not necessarily distinct).
Input
The first and the only line of input contains a single integer N.

Constraints:
1 <= N <= 109
Output
If the given integer can be represented as the sum of two soft integers, print "YES", else print "NO", without the quotes.
Example
Sample Input:
16

Sample Output:
YES

Explaination:
16 = 10 + 6
Both 10 and 6 are soft numbers:
10 = 4*(4+1)/2
6 = 3*(3+1)/2
 */
