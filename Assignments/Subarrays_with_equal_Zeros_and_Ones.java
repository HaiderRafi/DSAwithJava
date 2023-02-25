package Assignments;
import java.util.*;
public class Subarrays_with_equal_Zeros_and_Ones {
    public static void countSubarrays(int arr[],int n){
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                arr[i]=-1;
            }
        }

        long ans=0; // no of such subarrays
        int sum=0;


        HashMap<Integer,Integer> hm=new HashMap<>();

        for(int i=0;i<n;i++){
            sum=sum+arr[i];

            if(sum==0){
                ans=ans+1; // 1 subaarays starting from first element
            }

            if(hm.containsKey(sum)){  // subarrays somewhere inbetween
                int freq=hm.get(sum);
                ans=ans+freq;
                hm.put(sum,freq+1);
            }
            else{
                hm.put(sum,1);
            }
        }

        System.out.println(ans);
    }
    public static void main (String[] args) {
        // Your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        countSubarrays(arr,n);
    }
}




/*
Subarrays with equal 1s and 0s
medium
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an array arr[] of size N containing 0s and 1s only. The task is to count the subarrays having an equal number of 0s and 1s.
Input
The first line of the input contains an integer N denoting the size of the array and the second line contains N space-separated 0s and 1s.

Constraints:-
1 <= N <= 10^6
0 <= A[i] <= 1
Output
For each test case, print the count of required sub-arrays in new line.
Example
Sample Input
7
1 0 0 1 0 1 1

Sample Output
8

The index range for the 8 sub-arrays are:
(0, 1), (2, 3), (0, 3), (3, 4), (4, 5)
(2, 5), (0, 5), (1, 6)
 */
