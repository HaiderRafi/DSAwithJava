package Assignments;
import java.util.*;
public class FizzBuzz {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        for(int i =1; i<=N;i++){
            if(i%3==0){
                if(i%5==0){
                    System.out.print("FizzBuzz"+ " ");
                }
                else{
                    System.out.print("Fizz"+ " ");
                }
            }
            else if(i%5==0){
                System.out.print("Buzz"+ " ");
            }
            else if(i%5==0&&i%3==0){
                System.out.print("FizzBuzz"+ " ");

            }
            else{
                System.out.print(i+" ");
            }
        }
    }
}

/*
FizzBuzz
easy
asked in interviews by 10 companies
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given a number N for each I (1 < = I < = N), you have to print the number except:-
For each multiple of 3, print "Fizz" instead of the number.
For each multiple of 5, print "Buzz" instead of the number.
For numbers that are multiples of both 3 and 5, print "FizzBuzz" instead of the number.
Input
The input contains a single integer N.

Constraints:-
1 ≤ N ≤ 1000
Output
Print N space separated number or Fizz buzz according to the condition.
Example
Sample Input:-
3

Sample Output:-
1 2 Fizz

Sample Input:-
5

Sample Output:-
1 2 Fizz 4 Buzz
 */
