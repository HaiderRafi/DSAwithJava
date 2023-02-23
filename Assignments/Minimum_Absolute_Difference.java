package Assignments;
import java.util.*;
public class Minimum_Absolute_Difference {
    public static void main(String[] args) {
        // Main Method is here
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        int A[] = new int[n];
        int B[] = new int[n];

        for(int i=0;i<n;i++){
            A[i]=in.nextInt();
        }
        for(int i=0;i<n;i++){
            B[i]=in.nextInt();
        }
        int i=0;
        int j=0;
        int minPosDiff=Integer.MAX_VALUE;
        while(i<n && j<n){
            int diff=Math.abs(A[i]-B[j]);
            minPosDiff=Math.min(minPosDiff,diff);
            if(A[i]<B[j])
                i++;
            else
                j++;
        }
        System.out.print(minPosDiff);

    }
}



/*
Minimum Absolute Difference
easy
asked in interviews by 1 company
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
you have given two integer arrays A and B of length N sorted in non-decreasing order. Calculate the minimum possible difference between elements of A and B.
Solve this problem in O(N) complexity.
Input
first- line contains a single integer N
second and third lines contain N space- separated integer A[i] and B[i].
Output
Print the minimum absolute difference between two elements from A and B.
Example
Sample Input:
6
12 15 16 19 21 29
1 2 3 58 61 65

Sample Output:
9

Explanation : minimum absolute difference can be found between first element of first array and third element of second array.
 */
