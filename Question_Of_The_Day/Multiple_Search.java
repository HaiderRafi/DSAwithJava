package Question_Of_The_Day;
import java.util.*;

public class Multiple_Search {
    public static void main (String[] args) {
        // Your code here
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        System.out.println(min(a,b,c));

    }
    static int min(int a, int b ,int c){

        for(int i=a;i<=b;i++){
            if(i%c==0){
                return i;
            }
        }
        return -1;
    }
}


/*
Multiple Search
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Print a number between A and B (inclusive) that is a multiple of C. If such numbers exist, print the minimum among them. If there is no such number, print -1.
Input
The input contains three space separated integers.
A B C

Constraints
0≤X≤1000
All values in input are integers.
Output
Print the answer.
If there is no number with the desired property, print -1.
Example
Sample Input 1
123 456 100
Sample Output 1
200

Sample Input 2
630 940 314
Sample Output 2
-1
 */
