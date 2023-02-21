package Question_Of_The_Day;

import java.util.Scanner;

public class Alexa_and_Sockets {
    public static void main (String[] args) {
        // Your code here
        Scanner sc= new Scanner(System.in);
        int a =sc.nextInt();
        int b= sc.nextInt();

        int result= (b+a-3)/(a-1);
        System.out.print(result);
    }
}




/*
Alexa and Sockets
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Alexa's house has only one socket.
Alexa wants to extend it with some number of power strips, each with A sockets, into B or more empty sockets. One power strip with A sockets can extend one empty socket into A empty sockets.
Find the minimum number of power strips required.
Input
The input consists of two space separated integers.
A B

Constraints
All values in input are integers.
2≤A≤20
1≤B≤20
Output
Print the minimum number of power strips required.
Example
Sample Input 1
4 10
Sample Output 1
3

Sample Input 2
8 9
Sample Output 2
2

Sample Input 3
8 8
Sample Output 3
1

 */
