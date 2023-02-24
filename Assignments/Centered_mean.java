package Assignments;
import java.util.*;
public class Centered_mean {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);


        int sum = 0;
        int count = 0;
        for (int i = 1; i < n - 1; i++) {
            sum += arr[i];
            // sum += arr[i];
            count++;
        }
        System.out.println(sum / count);

    }
}

/*
Centered mean
easy
asked in interviews by 1 company
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an array arr[] of N positive integers. Write a Program for a centered mean of array elements except the smallest and largest elements. print the final centered mean of the array.
Input
There will be a single line of input containing number of elements in the array.
Next line contains N elements of the array arr.

Constraints:
1 <= N <= 104
1 <= arr[i] <= 105
Output
print the final centered mean of array.
Example
Sample Input:
5
4 2 2 6 8
Sample Output:
4

Explanation:
centered mean=(2+4+6)/3=4.
 */
