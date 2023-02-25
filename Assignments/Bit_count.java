package Assignments;
import java.util.*;
public class Bit_count {
    public static void numberOfSetBits(long n){
        int count=0;

        while(n>0){
            if((n&1) ==1){
                count++;
            }
            n= n>>1;
        }

        System.out.println(count);
    }

    // 0
    //

    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        numberOfSetBits(n);
    }
}


/*
Bit count
easy
asked in interviews by 1 company
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Negi is fascinated with the binary representation of the number. Tell him the number of set bits (ones) in the binary representation of an integer N.
Input
The first line of the input contains single integer N.

Constraints
1 <= N <= 1000000000000
Output
The output should contain a single integer, the number of set bits (ones) in the binary representation of an integer N.
Example
Sample Input
7

Sample Output
3

Sample Input
16

Sample Output
1
 */
