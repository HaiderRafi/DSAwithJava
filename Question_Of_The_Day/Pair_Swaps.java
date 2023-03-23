package Question_Of_The_Day;
import java.util.*;
public class Pair_Swaps {

    public static void main (String[] args) {
        // Your code here

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        TreeMap<Integer,Integer> map = new TreeMap<>();
        for(int i=0;i<N;i++){
            int A = sc.nextInt();
            map.merge(A,1,(j,k)->j+k);
        }
        long ans = (long)N*(N-1)/2;
        for(Map.Entry<Integer,Integer> m:map.entrySet()){
            long num = m.getValue();
            ans -= num*(num-1)/2;
        }
        System.out.println(ans);
    }
}



/*
Pair Swaps
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an array of N integers. Find the number of pairs (i, j) of integers satisfying all of the following conditions:
1 ≤ i < j ≤ N
Ai ≠ Aj
​
Input
The first line of the input consists of an integer N. The second line consists of N space separated integers.

Constraints
All values in input are integers.
2 ≤ N ≤ 3×10^5
1 ≤ Ai ≤ 10^9
Output
Print the answer as an integer.
Example
Sample Input 1
3
1 7 1
Sample Output 1
2

Sample Input 2
10
1 10 100 1000 10000 100000 1000000 10000000 100000000 1000000000
Sample Output 2
45
 */
