package Assignments;
import java.util.*;
public class Golden_Rule {
    public static void findVoilation(int arr[], int n){
        int count=0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
    public static void main (String[] args) {
        // Your code here
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr= new int[n];

        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        findVoilation(arr,n);
    }
}


/*
Golden Rule
medium
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Nishu loves to arrange things in order. Nishu sticks to his “Golden rule” that every set of numbers must be in ascending order. Unfortunately, that is not always the case. Nishu defines a “violation” as a situation when a smaller number comes after a larger number in the set, which violates the ascending order.

Given a set of integers, Nishu needs to find out the total number of such violations.
Input
First line contain a single integer N.
Second line contain N space separated integer A[i].
Output
Print number of violation.
Example
Sample Input 1:
5
4 5 6 7 1

Sample Output 1:
4

Explanation :
4, 5, 6 and 7 are in order.
1 comes after 4, 5, 6, 7 on the list, but is smaller than all 4 of them. Hence 4 is the answer.

Sample Input 2:
5
5 4 3 2 1

Sample Output 2:
10
 */
