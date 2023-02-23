package Assignments;
import java.util.*;
public class Mohit_and_array {
    public static void findMissingElement(int arr[],int n){
        boolean found;

        for(int i=1;i<=n;i++){
            found=false; // before finding any element marking it false

            for(int j=0;j<n-1;j++){
                if(arr[j]==i){
                    found=true;
                    break;
                }
            }
            if(found==false){ // found the missing value
                System.out.println(i);
                return;
            }

        }
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n-1];
        for(int i=0;i<n-1;i++){
            a[i]=sc.nextInt();
        }

        findMissingElement(a,n);
        // 5
        // 1 2 3 4 5
        // 1 5 3 2
    }
}




/*
Mohit and array
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Mohit has an array of N integers containing all elements from 1 to N, somehow he lost one element from the array.
Given N-1 elements your task is to find the missing one.
Input
The first line of input contains a single integer N, the next line contains N-1 space-separated integers.

Constraints:-
1 ≤ N ≤ 1000
1 ≤ elements ≤ N
Output
Print the missing element
Example
Sample Input:-
3
3 1

Sample Output:
2

Sample Input:-
5
1 4 5 2

Sample Output:-
3
 */
