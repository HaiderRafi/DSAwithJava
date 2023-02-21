package Question_Of_The_Day;

import java.util.Scanner;

public class Cocoa_Products {
    public static void main (String[] args) {
        // Your code here
        Scanner sc= new Scanner (System.in);

        int a= sc.nextInt();
        int b= sc.nextInt();

        if(a>=15 && b>=8){
            System.out.println(1);
        } else if(a>=10&&b>=3){
            System.out.println(2);
        } else if(a>=3){
            System.out.println(3);
        }else{
            System.out.println(4);
        }
    }
}
/*
Cocoa Products
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
There are four major items made of Cocoa Powder:

1. a product with at least 15 percent cocoa powder and at least 8 percent milk is called Cocoa Shake;
2. a product with at least 10 percent cocoa powder and at least 3 percent milk and that is not cocoa shake is called Brownie;
3. a product with at least 3 percent cocoa powder and is not cocoa shake and brownie is called cake;
4. anything else is called flavoured cocoa.



Newton's famous product contains A percent cocoa powder and B percent milk.
Which of the item above does Newton’s product fall into?
Print your answer as an integer according to the Output section.
Input
The first line contains two integers A and B.

Constraints
0 ≤ A ≤ 100
0 ≤ B ≤ 100
A+B ≤ 100
A and B are integers.
Output
Print an integer as follows:

if Newton's product is cocoa Shake, print 1;
if Newton's product is brownie, print 2;
if Newton's product is cake, print 3;
if Newton's product is flavoured cocoa, print 4.
Example
Sample Input 1
10 8

Sample Output 1
2

Explaination
This product contains 10 percent cocoa powder and 8 percent milk , so it can not be cocoa Shake .
It is brownie .


Sample Input 2
4 2

Sample Output 2
3

Explaination
It contains more than 3 percent cocoa powder , so it is a cake.


Sample Input 3
0 0

Sample Output 3
4

Explaination
It is a flavoured Shake.
 */
