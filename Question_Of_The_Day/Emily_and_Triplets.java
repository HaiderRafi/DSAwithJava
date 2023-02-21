package Question_Of_The_Day;

import java.util.Scanner;

public class Emily_and_Triplets {
    public static void main (String[] args) {
        // Your code here
        Scanner sc= new Scanner (System.in);
        int s=sc.nextInt();
        int y=sc.nextInt();

        int count=0;
        for(int i=0;i<s+1;i++){
            for(int j=0;j<s+1;j++){
                for(int k=0;k<s+1;k++){
                    if(i+j+k<=s && i*j*k<=y){
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}

/*
Emily and Triplets
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Emily was playing with triplets. She was excited to find out how many triples of non-negative integers (a, b, c) satisfy a+b+c≤S and a×b×c≤T, where S & T are non-negative integers.
Input
The input line contains S, and T separated by space.

Constraints
0≤S≤100
0≤T≤10000
S and T are integers.
Output
Print the number of triples of non-negative integers (a, b, c) satisfying the conditions.
Example
Sample Input 1
1 0

Sample Output 1
4

Sample Input 2
2 5

Sample Output 2
10

Sample Input 3
10 10

Sample Output 3
213

(In example 1,the triplets are(0,0,0),(0,0,1),(0,1,0) and (1,0,0)
 */
