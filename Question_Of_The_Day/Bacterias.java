package Question_Of_The_Day;

import java.util.Scanner;

public class Bacterias {
    public static void main (String[] args) {
        // Your code here

        Scanner sc= new Scanner(System.in);

        long a= sc.nextLong();
        long b= sc.nextLong();
        long k= sc.nextLong();

        if(a==b){
            System.out.println(0);
        }else{
            int count=0;
            while(a<b){   //this condition is true, when ever this condtion will false the loop will break;
                a*=k;
                count++;
            }
            // System.out.println(a);
            System.out.println(count);
        }
    }
}

/*
Bacterias
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
There are A Bacterias.
Each time Jerry shouts, the bacterias multiply by K times.
In order to have B or more slimes, at least how many times does Jerry need to shout?
Input
Input is given from Standard Input in the following format:
A B K

Constraints
1≤A≤B≤10^9
2≤K≤10^9
All values in input are integers.
Output
Print the answer.
Example
Sample Input 1
1 4 2
Sample Output 1
2

Sample Input 2
7 7 10
Sample Output 2
0

Sample Input 3
31 415926 5
Sample Output 3
6

(In first case, after the first shout Jerry will have 2 bacteria and after the second shout, he will have 4(2*2) bacteria.
 */
