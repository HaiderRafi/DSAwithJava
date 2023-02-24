package Assignments;
import java.util.*;
public class Bubble_Sort_descending_order {
    static void bubblesort(int[] arr, int n){
        for(int i=0; i<n-1;i++){
            for(int j=0; j<n-i-1;j++){
                if(arr[j]<arr[j+1]){
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void main (String[] args) {
        // Your code here
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();

        int []arr=new int[n];

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        // for(int i=0;i <arr.length;i++){
        //     System.out.print(arr[i]+ " "); //printing unsorted array
        // }

        bubblesort(arr,n);   //calling function

        for(int i=0;i<n;i++){ // sorted
            System.out.print(arr[i]+" ");
        }

    }
}


/*
Bubble Sort (descending order)
easy
asked in interviews by 23 companies
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an array, sort the array in reverse order by simply swapping its adjacent elements.
Input
First line of the input contains an integer, N, which denotes the length of the array. Next N inputs are elements of the array that is to be sorted in descending order.

Constraints
1<=N<=1000
-10000<=Arr[i]<=100000
Output
Output sorted array in descending order where each element is space separated.
Example
Sample Input:
6
3 1 2 7 9 87

Sample Output:
87 9 7 3 2 1
 */
