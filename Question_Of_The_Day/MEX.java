package Question_Of_The_Day;


import java.util.Arrays;
import java.util.Scanner;

public class MEX {
    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();

        int[]array= new int[n];

        for(int i=0; i<array.length;i++){
            array[i]=sc.nextInt();
        }

        Arrays.sort(array);

        int prev = -1;
        for (int i = 0; i < n; i++) {
            if (array[i] == prev) {
                continue;
            }
            if (array[i] > prev + 1) {
                System.out.println(prev + 1);
                return;
            }
            prev = array[i];
        }
        System.out.println(prev + 1);
    }
}

/*
MEX
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
You are given a sequence of length N consisting of integers:
A=(A1, A2,...., AN)
Find the smallest non-negative integer not in (A1, A2,....,AN).
Input
The input contains N and elements of sequence separated by a new line.
N
A1, A2,. , AN

Constraints
1≤N≤2000
0≤Ai≤2000
All values in the input are integers.
Output
Print the answer.
Example
Sample Input 1
8
0 3 2 6 2 1 0 0
Sample Output 1
4

Sample Input 2
3
2000 2000 2000
Sample Output 2
0
 */
