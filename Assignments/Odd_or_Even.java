package Assignments;
import java.util.*;
public class Odd_or_Even {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
//         int no = input.nextInt();
//         int number=0;

//         int result = no%2;
// //        System.out.println(result);

//         if(result==0){
// //            System.out.println("even");
//             number=1;
//         } else if (result==1) {
// //            System.out.println("odd");
//             number=2;

//         }

//         switch (number){
//             case 1:
//                 System.out.println("Even");
//                 break;

//             case 2:
//                 System.out.println("Odd");
//             break;
//         }

        int n=sc.nextInt();
        if(n%2==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }

    }
}

/*
Odd or Even
easy
asked in interviews by 3 companies
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Write a program to check whether a number is even or odd using switch case.
Input
First Line of the input contains the number n.

Constraints
1 <= n <= 1e9
Output
If the number is even print "Even" otherwise "Odd"
Example
Sample Input :
23

Sample Output :
Odd

Sample Input :
24

Sample Output :
Even
 */
