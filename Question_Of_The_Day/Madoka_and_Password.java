package Question_Of_The_Day;
import java.util.*;
public class Madoka_and_Password {
    public static void main (String[] args) {
        // Your code here
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int num1=0;
        int num2=0;
        int a=1;
        int b=2;
        int sum=0;
        int i=0;
        while(sum!=n)
        { if(i%2==0)
        {
            num1=num1*10+a;
            sum+=a;
        }
        else
        {
            num1=num1*10+b;
            sum+=b;
        }
            i++;
            if(sum>n)
            {
                num1=0;
                break;
            }

        }
        i=0;
        sum=0;
        while(sum!=n)
        { if(i%2!=0)
        {
            num2=num2*10+a;
            sum+=a;
        }
        else
        {
            num2=num2*10+b;
            sum+=b;
        }
            i++;
            if(sum>n)
            {
                num2=0;
                break;
            }

        }
        System.out.print(Math.max(num1,num2));
    }
}




/*
Madoka and Password
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Madoka finally found the administrator password for her computer. Her father is a well-known popularizer of mathematics, so the password is the answer to the following problem. Madoka is too tired of math to solve it herself, so help her to solve this problem!
Find the maximum decimal number without zeroes and with no equal digits in a row, such that the sum of its digits is n.
Input
The input consists of an integer n denoting the required sum of digits.

Constraints
1 ≤ n ≤ 1000
Output
Print the maximum number you can obtain.
ai_logoNEWTON AI
BETA
Simpler Explanation
Concepts Used
Example
Sample Input 1
5
Sample Output 1
212

Sample Input 1
4
Sample Output 1
121
 */
