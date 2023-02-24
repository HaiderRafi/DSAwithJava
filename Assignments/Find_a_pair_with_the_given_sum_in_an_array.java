package Assignments;
import java.util.*;
public class Find_a_pair_with_the_given_sum_in_an_array {
    public static void main (String[] args) {
        // Your code here
        Scanner sc= new Scanner(System.in);
        int n =sc.nextInt();
        int[] arr= new int[n];
        for(int i= 0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        int x=sc.nextInt();

        Arrays.sort(arr);

        int i=0;
        int j=n-1;
        while(i<j){
            if((arr[i]+arr[j])<x){
                i++;
            }else if((arr[i]+arr[j])>x){
                j--;
            }
            else{
                System.out.println("Pair found ("+arr[j]+", "+arr[i]+")");
                return;
            }
        }
        System.out.println("Pair not found");

    }
}


/*
Find a pair with the given sum in an array
medium
hint
Hint

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an unsorted integer array having distinct integers, find a pair with the given sum in it.
First element of pair > second element of pair
Input
First line of input contains a single integer N, next line contains N space separated integers depicting the values of array and third line consist target sum.

Constraints:
2<=N<=5*(10^5)
1<=A[i], target<=2*(10^9)
Target
Output
Print the pair of integers which sum is target.
Example
Sample Input1:-
6
8 7 4 5 3 1
10

Sample Output:-
Pair found (7, 3)


Sample Input2:
6
5 2 6 8 1 9
12

Sample Output:
Pair not found
 */
