package Assignments;
import java.util.*;
public class max_complement {
    public static void main (String[] args) {
        // Your code here
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int A[]=new int[n];

        for(int i=0;i<n;i++){
            A[i]=in.nextInt();

        }

        int B[]=new int[n/2];



        int i,j;
        for (i=0, j=A.length-1;i<=(n-1)/2;i++,j--)
            B[i]=A[i]*A[j];



        int big=B[0];



        for (int t=1;t<=(n-1)/2;t++){
            if (big<B[t]){
                big=B[t];

            }
        }

        System.out.print(big);
    }
}


/*
max. complement
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
You have given an array A of even length. Print the maximum possible product of any number and their complement.
The first element is the complement of the last element, the second element is the complement of the second last, and so on.
Solve the given problem in O(n).
Input
First line contain a integer N.
Next line contain N space integer A[i].

Constraints
1<=N<=10^5
1<=A[i]<=10^9
Output
Print the maximum possible product.
Example
Sample Input 1:
8
1 3 4 2 3 4 8 6

Sample Output 1:
24

Sample Input 2:
6
1 2 3 4 5 6

Sample Output 2:
12
 */
