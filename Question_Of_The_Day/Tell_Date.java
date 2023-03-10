package Question_Of_The_Day;

import java.util.Scanner;

public class Tell_Date {
    public static void main (String[] args) {
        // Your code here
        Scanner sc= new Scanner(System.in);
        String n= sc.nextLine();


        // System.out.println(n.charAt(6));
        if(n.charAt(6)=='1'&& n.charAt(5)=='1'){
            System.out.println("After");

        }else if(n.charAt(6)=='2'&& n.charAt(5)=='1'){
            System.out.println("After");

        }else if(n.charAt(6)>='6'&&n.charAt(6)<='9'){
            System.out.println("After");

        }else if(n.charAt(6)=='0'){
            System.out.println("After");

        }else if(n.charAt(6)>='1'&&n.charAt(6)<='5'){
            System.out.println("Before");
        }
    }
}

/*
Tell Date
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
You are given a string S in yyyy/mm/dd format, which represents a date in 2022. You have to tell whether the date if before or after 20 June 2022.

If the date is before 20 June, print "Before". If the date is 20 June or later, Print "After".
Input
The first and only line of the input contains a string S.

Constraints:
S is always a valid date
Output
Print the answer
Example
Sample Input 1:
2022/01/30

Sample Output 1:
Before

Explanation:
30 Jan 2022 is before 20 June 2022

Sample Input 2:
2022/10/20

Sample Output 2:
After

Explanation:
20 Nov 2022 is after 20 June 2022

 */
