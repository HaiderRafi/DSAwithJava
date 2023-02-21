package Question_Of_The_Day;

import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;
public class Integer_Product {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigDecimal x = sc.nextBigDecimal();
        BigDecimal y = sc.nextBigDecimal();

        BigDecimal product = x.multiply(y);
        product = product.setScale(0, RoundingMode.DOWN);

        System.out.println(product);

// x---------x---------x----------x---------x----------x--------
        //         Scanner sc= new Scanner(System.in);
//         long a=sc.nextLong();
//         double b=sc.nextDouble();

//         System.out.print(Math.round(Math.floor(a*b)));


// x---------x---------x----------x---------x----------x--------
//         // Scanner sc = new Scanner(System.in);
//         // long a  =sc.nextLong();
//         // double b=sc.nextDouble();
//         // long result=(long)(a*b);
//         // System.out.println(result);
//     }
// }
// x---------x---------x----------x---------x----------x--------
    }
}

/*
Integer Product
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Bob has two integers, x and y, and wants to calculate their product.
As he likes integers so he wants to print the product as an integer.
Input
Constraints
0≤A≤10 ^ 15
0≤B<10
A is an integer.
B is a number with two digits after the decimal point.
Output
Print the answer as an integer.
Example
Sample Input 1
198 1.10

Sample Output 1
217
We have 198×1.10=217.8. After truncating the fractional part, we have the answer: 217.

Sample Input 2
1 0.01

Sample Output 2
0

Sample Input 3
1000000000000000 9.99

Sample Output 3
9990000000000000
 */
