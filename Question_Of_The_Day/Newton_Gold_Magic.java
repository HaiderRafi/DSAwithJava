package Question_Of_The_Day;

import java.util.Arrays;
import java.util.Scanner;

public class Newton_Gold_Magic {
    public static void main (String[] args) {
        // Your code here
        Scanner sc= new Scanner(System.in);

        int n= sc.nextInt();
        int [] arr= new int[n];

        // double sum=arr[0];
        for(int i=0; i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        Arrays.sort(arr);

        double sum=arr[0];
        for(int i=1;i<arr.length;i++){
            // sum+=arr[i]/2;
            sum=(sum+arr[i])/2;
        }
        System.out.printf("%.8f",sum);
    }
}

/*
Newton Gold Magic
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Newton knows magic and he can mysteriously combine several items to create new items.
One day, Newton got his hand on N bars of gold. He cannot carry all of the N bars, so he used his magic to combine bars. Each gold bar has a weight represented by Wi (1 ≤ i ≤ N).
In one operation, Newton can take 2 bars of gold and combine them to create a single bar of gold. The weight of the new bar is (X+Y)/2 where X and Y represent the weights of the two initial bars.
Newton will perform this operation N-1 times and in the end, he will be left with only one bar of gold.
Find out the maximum possible weight of the final bar left with Newton.
Input
The first line of the input contains a single integer N
The next line contains N space-separated integers, W1, W2, . ., WN

Constraints:
2 ≤ N ≤ 50
1 ≤ Wi ≤ 1000
Output
Print the answer in a single line with decimal values up to 8 digits.
Example
Sample Input 1:
2
2 4

Sample Output 1:
3.00000000

Sample Explanation 1:
(2+4)/2 = 3


Sample Input 2:
3
500 300 200

Sample Output 2:
375.00000000

Sample Explanation 2:
The maximum weight can only be achieved by first combining 300 and 200 to get 250, then combining 250 with 500 to get 375.
 */
