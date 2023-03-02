package Question_Of_The_Day;
import java.io.*;
public class Fantasy {
    public static void main (String[] args) throws IOException {
        // Your code here
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        String[] str= br.readLine().split(" ");

        long N=Long.parseLong(str[0]);
        long K=Long.parseLong(str[1]);

        for(int i=0;i<K;i++){
            if(N%200==0){
                N/=200L;
            }else{
                N=(N*1000L)+200L;
            }
        }
        System.out.println(N);
    }
}




/*
Fantasy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Bob has a fantasy for integer 200. He has an integer N and wants you to do the given operation K times and print the result.

Operation:
1. Add 200 to the end of it, if N is not divisible by 200.
2. Otherwise divide it by 200.

For example, 6 would become 6200 and 434 would become 434200.
Input
The first line contains two integers N and K.

Constraints
All values in the input are integers.
1≤N≤10 ^ 5
1≤K≤20
Output
Print the answer as an integer.
Example
Sample Input 1
2021 4

Sample Output 1
50531
Applying the operation on N=2021 results in N becoming 2021→2021200→10106→10106200→50531.

Sample Input 2
40000 2

Sample Output 2
1

Sample Input 3
8691 20

Sample Output 3
84875488281
The answer may not fit into the signed 32- bit integer type.
 */
