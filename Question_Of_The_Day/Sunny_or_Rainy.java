package Question_Of_The_Day;
import java.util.*;
public class Sunny_or_Rainy {
    public static void main (String[] args) {
        // Your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=sc.next();

//        for(int i=0;i<s.length();i++){
//            // System.out.println(s.charAt(i));
//            if(s.charAt(n-1)=='x'){
//                System.out.println("No");
//                break;
//            }else{
//                System.out.println("Yes");
//                break;
//            }
//        }
// x---------x--------x-------x---------x--------x------------x-------------x---------
//      here we don't need a loop, the right approach to do it
        if(s.charAt(n-1)=='x'){
            System.out.println("No");
        }else{
            System.out.println("Yes");
        }
    }
}




/*
Sunny or Rainy?
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
You are given a string S, which represents a weather forecast for the seven days starting tomorrow.
The ith of those seven days is forecast to be sunny if the ith character of S is o, and rainy if that character is x. Tell us whether the Nth day is forecast to be sunny.
Input
The first line of the input consists of an integer N.
The second line of the input consists of a string.

Constraints
N is an integer between 1 and 7 (inclusive).
S is a string of length 7 consisting of o and x.
Output
Print Yes if the N- th of the seven days starting tomorrow is forecast to be sunny, and No if that day is forecast to be rainy.
Example
Sample Input 1
4
oooxoox
Sample Output 1
No

Sample Input 2
7
ooooooo
Sample Output 2
Yes
 */
