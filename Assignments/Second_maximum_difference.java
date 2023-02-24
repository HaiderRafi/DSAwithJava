package Assignments;
import java.util.*;
public class Second_maximum_difference {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int FirstElem = arr[0];
        int secondLastElem = arr[n - 2];

        int lastElem = arr[n - 1];
        int secondFirst = arr[1];

        int secondMaxDiffOne = secondLastElem - FirstElem;
        int secondMaxDiffTwo = lastElem - secondFirst;

        if (secondMaxDiffOne > secondMaxDiffTwo) {
            System.out.print(secondMaxDiffOne);
        } else {
            System.out.print(secondMaxDiffTwo);
        }

    }
}


/*
Second maximum difference
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an array of n integers. Print the second maximum difference between any two numbers in the array.
Input
First line contains n.
Next line contains n space separated integers.

Constraints
3 <= n <= 105
1 <= arr[i] <= 109
Output
A single integer denoting the answer.
Example
Input:
5
3 1 4 6 9

Output:
6

Explanation :
Difference between 1 and 9 is 8.
Difference between 3 and 9 is 6.
 */
