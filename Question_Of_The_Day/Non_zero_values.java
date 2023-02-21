package Question_Of_The_Day;

import java.util.Scanner;

public class Non_zero_values {
    public static void main (String[] args) {
        // Your code here
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();

        int[][]arr=new int[n][k];
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<k;j++){
                arr[i][j]=sc.nextInt();

                // System.out.println(arr[i][j]+" ");

                int num=arr[i][j];
                if(num>0){
                    count++;
                }

            }

        }
        System.out.println(count);
    }
}

/*
Non-zero values
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Print the number of values in the array that are NOT zeros for a n*m dimensional array
Input
1st line : space separated values for n and m
Next n lines: m space separated values
Output
Number of nonzero values in the array
Example
Input:
3 3
0 0 0
0 0 1
1 0 2

Output:
3
 */
