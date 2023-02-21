package Question_Of_The_Day;

import java.util.Scanner;

public class Condition_Check {
    public static void main (String[] args) {
        // Your code here
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[]x= new int[n];
        int[]y= new int[n];

        for(int i=0;i<n;i++){
            x[i]=sc.nextInt();

        }
        for(int i=0;i<n;i++){

            y[i]=sc.nextInt();
        }

        int sum=0;
        for(int i=0;i<n;i++){
            sum+=x[i]*y[i];
        }
        // System.out.println(sum);

        if (sum == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}

/*
Condition Check
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Two arrays of size N are given, A and B.
Determine whether the sum of Ai*Bi for all i such that (1 ≤ i ≤ N).
Input
The first line contains one integer N.
The second line contains N integers A1, A2 ... AN.
The third line contains N integers B1, B2 ... BN.

Constraints
1 ≤ N ≤ 105
100 ≤ Ai ≤ 100
100 ≤ Bi ≤ 100
All values in the input are integers.
Output
If the inner product of A and B is 0, print Yes; otherwise, print No.
Example
Sample Input 1
2
-3 6
4 2

Sample Output 1
Yes

Sample Input 2
2
4 5
-1 -3

Sample Output 2
No

Explanation
The inner product of A and B is (−3)×4+6×2=0. Hence, Yes
The inner product of A and B is 4×(−1)+5×(−3)=−19. Hence, No
 */
