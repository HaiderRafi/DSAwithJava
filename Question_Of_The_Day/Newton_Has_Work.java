package Question_Of_The_Day;

import java.util.Scanner;

public class Newton_Has_Work {
    public static void main (String[] args) {
        // Your code here
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int m= sc.nextInt();

        int sum=0;
        for(int i=0; i<m;i++){
            int a=sc.nextInt();

            sum+=a;
        }
        int z= n-sum;


        if(sum>n){
            System.out.println(-1);
        }
        else {
            System.out.println(z);
        }
    }
}

/*
Newton Has Work
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Newton's teacher has given him N assignments to complete in M days. For the ith assignment, it takes Newton Ai days.

He cannot do multiple assignments at the same time.

What is the maximum number of days left with Newton to play in his holidays if he completes all the assignments.

Note: Print -1 If Newton cannot finish all the assignments during the Holidays.
Input
The first line of the input consists of two positive integers, M and N
The next line contains N integers, ith integers of which represents the number of days taken to complete the ith assignment.

Constraints:
1 <= M <= 2*10^6
1 <= N <= 2*10^4
1 <= Ai​ <= 2*10^4
Output
Print the maximum days left with Newton
Example
Sample Input 1:
30 5
1 2 3 4 5

Sample Output 1:
15


Sample Input 2:
10 2
10 10

Sample Output 2:
-1
 */
