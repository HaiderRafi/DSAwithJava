package Question_Of_The_Day;
import java.util.*;
public class Is_Median {
    public static void main (String[] args) {
        // Your code here
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        int[]arr={a,b,c};
        Arrays.sort(arr);
        if(b==arr[1]){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }
}


/*
Is Median?
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Anisha has 3 integers a, b, and c, Determine if b is the median of these integers.
Input
The input consists of three space- separated integers a, b and c.

Constraints
1 ≤ a, b, c ≤100
Output
If b is the median of the given integers, then print Yes, otherwise, print No.
Example
Sample Input 1
5 3 2
Sample Output 1
Yes

Sample Input 2
2 5 3
Sample Output 2
No
 */
