package Question_Of_The_Day;

import java.util.Scanner;

public class Assign_zero {
    public static void main (String[] args) {
        // Your code here
        Scanner sc= new Scanner(System.in);
        // int n= sc.nextInt();

        int[] arr= new int[5];

        for(int i=0; i<arr.length;i++){
            arr[i]=sc.nextInt();

        }
        // System.out.println(zero(arr,n));
        if(zero(arr,5)==0){
            System.out.println(1);
        }
        else if(zero(arr,5)==1){
            System.out.println(2);
        }
        else if
        (zero(arr,5)==2){
            System.out.println(3);
        }
        else if
        (zero(arr,5)==3){
            System.out.println(4);
        }
        else
        {
            System.out.println(5);
        }
    }
    static int zero(int[] arr,int n){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                return i;
            }
        }
        return -1;
    }
}

/*
Assign zero
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
You are given a sequence of 5 integers A. Initially, Ai (1 ≤ i ≤ 5) assigns i.
But due to some glitch, one of the integers in the array becomes 0.
Find out which integer of A assigned 0.
Input
The first line contains 5 integers A1, A2 ... A5.

Constraints
The values of A1, A2, A3, A4, A5 given as input are a possible outcome of the assignment.
Output
If the integer assigned 0 was Ai, print the integer i.
Example
Sample Input 1:
0 2 3 4 5

Sample Output 1:
1

Sample Input 2:
1 2 0 4 5

Sample Output 2:
3
 */
