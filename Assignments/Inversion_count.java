package Assignments;
import java.util.*;
public class Inversion_count {
    public static long count=0;



    public  static void merge(int arr[],int l, int m,int r){
        int n1= m-l+1; //elements in first half
        int n2= r-m;// in 2nd half

        int L[]=new int[n1]; //[ , , , ]
        int R[]=new int[n2];

        for(int i=0;i<n1;i++){ // copying first half
            L[i]=arr[l+i];
        }

        for(int j=0;j<n2;j++){ // coplying 2nd half
            R[j]=arr[m+1+j];
        }

        int i=0;
        int j=0;
        int k=l;

        while(i<n1 && j<n2){
            if(L[i]<=R[j]){
                arr[k]=L[i];
                i++;
            }
            else{
                count=count + (n1-i);
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
    }
    public static void mergeSort(int arr[], int l, int r) { // arr, 0 , n-1
        if (l < r) { // at least 2 elements are there
            int m = l + (r - l) / 2;   // Middle element of array
            mergeSort(arr, l, m); //Calling for first half sorting
            mergeSort(arr, m + 1, r); //Calling for second half sorting
            merge(arr, l, m, r); // Merging the sorted sub solutions
        }
    }
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        mergeSort(arr,0,n-1);
        System.out.println(count);
    }
}




/*
Inversion count
medium
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Calculate inversion count of array of integers.
Inversion count of an array is quantisation of how much unsorted an array is. A sorted array has inversion count 0, while an unsorted array has maximum inversion count.
Formally speaking inversion count = number of pairs i, j such that i < j and a[i] > a[j].
Input
The first line contain integers N.
The second line of the input contains N singly spaces integers.

1 <= N <= 100000
1 <= A[i] <= 1000000000
Output
Output one integer the inversion count.
Example
Sample Input
5
1 1 3 2 2

Sample Output
2

Sample Input
5
5 4 3 2 1

Sample Output
10
 */
