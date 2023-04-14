package Question_Of_The_Day;
import java.util.*;
public class Maximum_Range {
    public static void main (String[] args) {
        // Your code here
        Scanner sc=new Scanner(System.in);
        // int n=sc.nextInt();

        // int[]arr=new int[n];

        // for(int i=0;i<arr.length;i++){
        //     arr[i]=sc.nextInt();
        //     if(arr[i]==0){
        //         System.out.println(0);
        //         break;
        //     }else{
        //     System.out.println(arr.length);
        //     break;
        //     }


        // }

        int n = sc.nextInt();
        Map<Integer, Integer> m = new HashMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if (x < 0)
                x = -x;
            m.put(x, m.getOrDefault(x, 0) + 1);
        }
        long ans = 0;
        for (Map.Entry<Integer, Integer> it : m.entrySet()) {
            if (it.getKey() == 0)
                ans += 1;
            else if (it.getValue() >= 2)
                ans += 2;
            else
                ans += 1;
        }
        System.out.println(ans);



    }
}



/*
Maximum Range
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
You are given n integers a1, a2, …, an. You choose any subset of the given numbers (possibly, none, or all numbers) and negate these numbers (i. e. change x→(−x)). What is the maximum number of different values in the array you can achieve?
Input
The input consists of an integer n denoting the number of integers in the array. The second line contains n
integers a1, a2, …, an.

Constraints
1 ≤ n ≤ 100
−100 ≤ ai ≤ 100
Output
Print one integer: the maximum number of different elements in the array that you can achieve negating numbers in the array.
ai_logoNEWTON AI
BETA
Simpler Explanation
Concepts Used
Example
Sample Input 1
4
1 1 2 2
Sample Output 1
4

Sample Input 2
3
1 2 3
Sample Output 2
3
 */
