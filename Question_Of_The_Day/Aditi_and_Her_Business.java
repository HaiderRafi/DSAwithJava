package Question_Of_The_Day;
import java.util.*;
public class Aditi_and_Her_Business {
    public static void main (String[] args) {
        // Your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();

        }
        int maxLength = 1;
        int currentLength = 1;
        for (int i = 1; i < n; i++) {
            if (arr[i] >= arr[i - 1]) {
                currentLength++;
                maxLength = Math.max(maxLength, currentLength);
            } else {
                currentLength = 1;
            }
        }

        System.out.println(maxLength);
    }
}



/*
Aditi and Her Business
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Aditi runs a business for exactly n days. She knows that on the i- th day (1 ≤ i ≤ n) she makes ai money. She wants to know the length of the maximum non- decreasing subsegment in sequence ai. Help Aditi to find the required result.
Input
The first line of the input consists of an integer n. The second line of the input consists of n space- separated integers a1, a2,. , an.

Constraints
1 ≤ n ≤ 105
1 ≤ ai ≤ 109
Output
Print a single integer denoting the length of the maximum non- decreasing subsegment of sequence a.
Example
Sample Input 1
6
2 2 1 3 4 1
Sample Output 1
3

Sample Input 2
3
2 2 9
Sample Output 2
3
 */
