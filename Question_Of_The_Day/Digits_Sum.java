package Question_Of_The_Day;
import java.util.*;
public class Digits_Sum {
    public static void main (String[] args) {
        // Your code here
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

        int sum1=0;
        int sum2=0;
        while(a!=0){
            sum1+=a%10;
            a/=10;
        }

        while(b!=0){
            sum2+=b%10;
            b/=10;
        }
        if(sum1>sum2){
            System.out.println(sum1);
        }else{
            System.out.println(sum2);
        }
    }
}



/*
Digits Sum
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
For an integer n, let S(n) be the sum of digits in the decimal notation of n. For example, we have
S(123)=1+2+3=6. Given two 3- digit integers A and B, find the greater of S(A) and S(B).
Input
The input consists of two space-separated integers A and B.

Constraints
All values in the input are integers.
100 ≤ A, B ≤ 999
Output
Print the value of the greater of S(A) and S(B). If these are equal, print S(A).
Example
Sample Input 1
123 234
Sample Output 1
9

Sample Input 2
593 953
Sample Output 2
17

Sample Input 3
100 999
Sample Output 3
27
 */
