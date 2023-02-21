package Question_Of_The_Day;

import java.util.Scanner;

public class Camp {
    public static void main (String[] args) {
        // Your code here
        Scanner sc= new Scanner(System.in);
        int x= sc.nextInt();

        int n= sc.nextInt();
        int [] arr= new int[n];

        int sum=0;
        for(int i=0; i<arr.length;i++){
            arr[i]=sc.nextInt();
            sum=sum+arr[i];
            // System.out.println(arr[i]);
        }

        int p= x-sum;
        // System.out.println(p);
        if(p>0){
            System.out.println(p);
        } else if(p==0){
            System.out.println(0);
        }else{
            System.out.println(-1);
        }

    }
}

/*
Camp
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Yash has N days of Camp.

He has to visit M places. It will take Ai days for him to visit the ith place. He cannot visit multiple places on the same day, or hang out on a day he does an assignment.

What is the maximum number of days Yash can hang out during the Camp if he visits all the places during this Camp?

If Yash cannot visit all the places during the Camp, print -1 instead.
Input
The first line contains two integers N and M.
The second line contains N integers A1, A2 ... AM.

Constraints
1 ≤ N ≤ 106
1 ≤ M ≤ 104
1 ≤ Ai ≤ 104
Output
Print the maximum number of days Yash can hang out during the Camp, or -1.
Example
Sample Input 1
41 2
5 6

Sample Output 1
30

Explaination
He can do the first visit on the first 5 days, hang out on the next 30 days, and do the second visit on the last 6 days of the vacation. In this way, he can safely spend 30 days hanging out.


Sample Input 2
10 2
5 6

Sample Output 2
-1

Explaination
He cannot visit all the places.


Sample Input 3
11 2
5 6

Sample Output 3
0

Explaination
He can visit all places, but he will have no time to hang out.


Sample Input 4
314 15
9 26 5 35 8 9 79 3 23 8 46 2 6 43 3

Sample Output 4
9
 */
