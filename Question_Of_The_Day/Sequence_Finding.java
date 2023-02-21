package Question_Of_The_Day;

import java.util.Scanner;

public class Sequence_Finding {
    public static void main (String[] args) {
        // Your code here
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];

        //taking input
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        //if the input is odd perfrom this task
        if(n%2!=0){

            //reverse the array and pop out even numbers
            for(int i=arr.length-1;i>=0;i--){
                if(i%2==0){
                    System.out.print(arr[i]+" ");
                }
            }
            //pop out the odd number in normal array
            for(int i=0;i<arr.length;i++){
                if(i%2!=0){
                    System.out.print(arr[i]+" ");
                }
            }
        }

        //if input is even perform this task
        else{

            //reverse the array and pop out odd numbers
            for(int i=arr.length-1;i>=0;i--){
                if(i%2!=0){
                    System.out.print(arr[i]+" ");
                }
            }
            //pop out the even number in normal array
            for(int i=0;i<arr.length;i++){
                if(i%2==0){
                    System.out.print(arr[i]+" ");
                }
            }
        }
    }
}

/*
Sequence Finding
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
You have an empty sequence A. Along with that you are given an array B of size N. You create a new integer i = 0 and perform N operations on the sequence A in the following way:

Check if i == N + 1, break.

Append Bi to the end of A and increment i by 1.

Reverse the sequence A.

Find the sequence A after all the operations.
Input
The first line of the input contains a single integer N.
The second line of the input contains N space seperated integers.

Constraints:
1 <= N <= 105
1 <= Bi <= 109
Output
Print the sequence A after all the operations.
Example
Sample Input:
4
1 2 3 4

Sample Output:
4 2 1 3
 */
