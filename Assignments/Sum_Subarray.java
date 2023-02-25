package Assignments;
import java.io.*;
import java.util.*;

public class Sum_Subarray {
    public static void main (String[] args) throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s[]=br.readLine().split(" ");
        int n=Integer.parseInt(s[0]);
        long k=Long.parseLong(s[1]);
        int a[]=new int[n];
        s=br.readLine().split(" ");
        for(int i=0;i<n;i++)
        {
            a[i]=Integer.parseInt(s[i]);
        }
        int length=Integer.MAX_VALUE,i=0,j=0;
        long currSum=0;
        for(j=0;j<n;j++)
        {
            currSum+=a[j];
            while(currSum>=k)
            {
                length=Math.min(length,j-i+1);
                currSum-=a[i];
                i++;
            }
        }
        System.out.println(length);
    }
}


/*
Sum Subarray
medium
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
You are given an array Arr of N integers. A subarray is good if the sum of elements of that subarray is greater than or equal to K. Print the length of good subarray of minimum length.
Input
First line of input contains N and K.
Second line of input contains N integers representing the elements of the array Arr.

Constraints
1 <= N <= 100000
1 <= Arr[i] <= 100000
1 <= K <= 1000000000000
Output
Print the length of good subarray of minimum length.
Example
Sample input
5 12
2 3 2 5 5

Sample output
3

Explanation :
Subarray from index 3 to 5 has sum 12 and is therefore good and its length(3) is minimum among all possible good subarray.
 */
