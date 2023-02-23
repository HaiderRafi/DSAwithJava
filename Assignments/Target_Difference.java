package Assignments;
import java.util.*;
public class Target_Difference {
    public static void main (String[] args) {
        // Your code here
        Scanner in=new Scanner(System.in);
        int n= in.nextInt();
        int[]a= new int[n];
        for(int i=0;i<a.length;i++){
            a[i]= in.nextInt();
        }

        int target= in.nextInt();

        for(int i=0;i<a.length-1;i++){
            for(int j=1;j<a.length;j++){
                if(target==a[j]-a[i]){
                    System.out.print("Yes");
                    return;
                }
            }
        }
        System.out.print("No");
    }
}


/*
Target Difference
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given a one-dimensional sorted array A containing N integers.

You are also given an integer target, find if there exists a pair of elements in the array whose difference is equal to the target.
Approach this problem in O(n).
Input
The first line contains a single integer N.
The second line contains N space- separated integer A[i].
The third line contains an integer target.

Constraints
1<=N<=10^5
0<=A[i]<=10^9
0<=target<=10^9
Output
Print Yes if pair with given difference exists in our array otherwise print No.
Example
Sample Input 1:
5
1 2 7 9 11
5

Sample Output 1:
Yes


Sample Input 2:
5
1 1 8 8 25
0

Sample Output 2:
Yes
 */
