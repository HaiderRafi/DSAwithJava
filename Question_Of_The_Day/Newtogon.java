package Question_Of_The_Day;

import java.util.Scanner;

public class Newtogon {
    public static void main (String[] args) {
        // Your code here
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int [] arr= new int[n];

        for(int i=0; i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        int x=0;
        int sum=0;
        for(int i=0; i<arr.length;i++){

            x=Math.max(arr[i],x);
            sum+=arr[i];
        }

        if((sum-x)>x){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}

/*
Newtogon
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Newton wants to draw a polygon with N sides on a two- dimensional plane. Length of each side is given as L1, L2, ... , LN

You need to tell Newton whether or not it is possible to make the polygon.
Input
The first line of the input contains a single integer N
The next line contains N space separated integers L1, L2, ... , L3

Constraints:
3 <= N <= 10
1 <= Li <= 100
Output
Output "Yes" if its possible to draw the polygon, else "No"
Example
Sample Input 1:
4
1 2 3 10

Sample Output 1:
No

Explanation
The side with length 10 is greater than the sum of all other sides. So a polygon is not possible


Sample Input 2:
4
1 2 3 4

Sample Output 2:
Yes
 */
