package Question_Of_The_Day;

import java.util.Scanner;

public class Red_Or_String {
    public static void main (String[] args) {
        // Your code here
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        String s= sc.next();

        if(a<3200){
            System.out.print("red");

        }else{
            System.out.print(s);

        }
    }
}

/*
Red Or String?
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
You are given a string S and an integer A. You have to check whether or not the given integer A is smaller than 3200 or not. If it's smaller, print "red", otherwise print the string S.
Input
The first line of the input contains an integer A
The second line of the input contains a string S

Constraints:
1) 2800 ≤ A ≤ 5000
Output
Print the output string.
Example
Sample Input 1:
3400
lol

Sample Output 1:
lol

Sample Input 2:
3000
lol

Sample Output 2:
red
 */
