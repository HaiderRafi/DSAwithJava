package Question_Of_The_Day;

import java.util.Scanner;

public class Fight {
    public static void main (String[] args) {
        // Your code here
        Scanner sc= new Scanner(System.in);
        long h= sc.nextLong();
        int n= sc.nextInt();


        int []arr= new int[n];

        long sum=0;
        for(int i=0; i<arr.length;i++){
            arr[i]= sc.nextInt();

            sum=sum+arr[i];
        }
        if(h-sum<=0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}

/*
Fight
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Spiderman is fighting with a monster.

The health of the monster is H.

Spiderman has N moves, if he uses the i-th move, then monster’s health decreases by Ai.
There is no other way to decrease the monster's health.

Monster is dead if it’s health becomes 0 or below.

Note: He can’t use same move more than one time.

If Spiderman can win, print Yes; otherwise, print No.
Input
The first line contains two integers, H and N.
The second line contains N integers A1, A2 ... AN.

Constraints:
1 <= H <= 109
1 <= N <= 105
1 <= Ai <= 104
Output
If spiderman can win, print Yes; otherwise, print No.
Example
Sample Input 1
10 3
4 5 6

Sample Output 1
Yes
The monster's health will become 0 or below after, for example, using the second and third moves.

Sample Input 2
20 3
4 5 6

Sample Output 2
No

Sample Input 3
210 5
31 41 59 26 53

Sample Output 3
Yes

Sample Input 4
211 5
31 41 59 26 53

Sample Output 4
No
 */
