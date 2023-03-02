package Question_Of_The_Day;
import java.util.*;
public class Maximum_Addition {
    public static void main (String[] args) {
        // Your code here
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        long[]arr=new long[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextLong();
        }
        long max=0;
        long sum=0;
        long temp=0;
        for(int i=0;i<arr.length;i++){
            max=Math.max(max,arr[i]);
            sum+=arr[i];
            temp+=sum;
            System.out.println(temp+max*(i+1));
        }

    }
}



/*
Maximum Addition
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Newton is given an array S of N integers S1, S2,. . SN. He needs to perform some function on every subarray of the given array S whose starting element is the first element of the given array S.

The function is as follows:
Given an array A of size N, for each i from 1 to N, add the current maximum of the array A to Ai. Then calculate the sum of the resultant array.

Perform this function on all the subarrays whose starting element is the starting element of the given array S.
Input
The first line of the input contains a single integer N
The next line contains N different integers S1, S2,. . SN

Constraints:
1 <= N <= 4 x 105
1 <= Si <= 2 x 107
Output
Print the answer for each subarray in a single line
Example
Sample Input 1:
3
2 4 6

Sample Output 1:
4
16
38

Explanation:
Lets apply the function to the subarray [2, 4]:
1) For index 1, the current maximum of the array is 4, So the array changes to [6, 4]
2) For index 2, the current maximum of the array is 6, So the array changes to [6, 10]
Now the sum of the resultant array is 6+10 = 16

Similarly the output for the subarray [2] is 4 and for the subarray [2, 4, 6] is 38


Sample Input 2:
5
1 2 3 4 5

Sample Output 2:
2
8
19
36
60
 */
