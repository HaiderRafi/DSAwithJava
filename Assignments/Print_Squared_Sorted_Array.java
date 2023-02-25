package Assignments;
import java.util.*;
public class Print_Squared_Sorted_Array {
    public static void main (String[] args) {
        // Your code here
        Scanner sc= new Scanner(System.in);
        int T = sc.nextInt();
        while(T--> 0){
            int n= sc.nextInt();

            int[] arr= new int[n];

            for(int i=0; i<arr.length;i++){
                arr[i]=sc.nextInt();
            }

            // int[] ans= sortedsquare(arr);
            // System.out.println(Arrays.toString(ans));
            arr = sortedSquares(arr);

            for(int i = 0; i < n; i++)
                System.out.print(arr[i] + " ");
            System.out.println();

        }
    }
    //    static int[] sortedsquare(int [] arr){
    //     int i = 0;
    //     int j = arr.length - 1;

    //     int[] result = new int[arr.length];

    //     int count = arr.length - 1;
    //     while(count >= 0) {
    //         if(Math.abs(arr[i]) > Math.abs(arr[j])) {
    //             result[count] = arr[i]*arr[i];
    //             i++;
    //         }
    //         else {
    //             result[count] = arr[j]*arr[j];
    //             j--;
    //         }
    //         count--;
    //     }

    //     return result;
    public static int[] sortedSquares(int[] A) {
        int[] nums = new int[A.length];
        int k=A.length-1;
        int i=0, j=A.length-1;
        while(i<=j){
            if(Math.abs(A[i]) <= Math.abs(A[j])){
                nums[k--] = A[j]*A[j];
                j--;
            }
            else{
                nums[k--] = A[i]*A[i];
                i++;
            }
        }
        return nums;
    }
}



/*
Print Squared Sorted Array
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an sorted array Arr[] of size N, containing both negative and positive integers, you need to print the squared sorted output.

Note Try using two pointer approach
Input
The first line of input contains T, denoting the number of test cases. Each testcase contains 2 lines. The first line contains the N size of the array. The second line contains elements of an array separated by space.

Constraints:
1 ≤ T ≤ 100
1 ≤ N ≤ 10000
-10000 ≤ A[i] ≤ 10000

The Sum of N over all test cases does not exceed 10^6
Output
For each test case you need to print the sorted squared output in new line
Example
Input:
1
5
-7 -2 3 4 6

Output:
4 9 16 36 49
 */
