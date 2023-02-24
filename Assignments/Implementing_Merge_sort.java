package Assignments;

public class Implementing_Merge_sort {

}

//Copy And Paste The Code
/*
public static int[] implementMergeSort(int arr[], int start, int end)
    {
        // Your code here
       // You can have your own function where you will use
      // start and end position for divide purpose
      if(start<end){
     int mid = start + (end- start)/2;
      implementMergeSort(arr, start,mid);
      implementMergeSort(arr,mid+1,end);
      }
      int m = start + (end- start)/2;
              int n1= m-start+1; //elements in first half
        int n2= end-m;// in 2nd half

        int L[]=new int[n1]; //[ , , , ]
        int R[]=new int[n2];

        for(int i=0;i<n1;i++){ // copying first half
            L[i]=arr[start+i];
        }

        for(int j=0;j<n2;j++){ // coplying 2nd half
            R[j]=arr[m+1+j];
        }

        int i=0;
        int j=0;
        int k=start;

        while(i<n1 && j<n2){
            if(L[i]<=R[j]){
                arr[k]=L[i];
                i++;
            }
            else{
                arr[k]=R[j];
                j++;
            }
            k++;
        }

        // out of the loop when any of the array completes
        // copying the remaining elements
        while(i<n1){
            arr[k]=L[i];
            i++;
            k++;
        }

        while(j<n2){
            arr[k]=R[j];
            j++;
            k++;
        }
       return arr;
    }
 */



/*
Implementing Merge Sort
easy
asked in interviews by 33 companies
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an unsorted array, your task is to sort the array using merge sort.
Input
User Task:
Since this will be a functional problem, you don't have to take input. You just have to complete the function implementMergeSort() that takes 3 arguments.
arr: input array
start: starting index which is 0
end: ending index of array

Constraints
1 <= T <= 100
1 <= N <= 106
0 <= Arr[i] <= 109

Sum of 'N' over all test cases does not exceed 106
Output
You need to return the sorted array. The driver code will print the array in sorted form.
Example
Sample Input:
2
3
3 1 2
3
4 5 6

Sample Output:
1 2 3
4 5 6
 */
