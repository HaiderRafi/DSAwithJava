package Question_Of_The_Day;

import java.util.Scanner;

public class Time_Dilation {
    public static void main (String[] args) {
        // Your code here
        Scanner sc= new Scanner(System.in);
        float x= sc.nextFloat();
        float y= sc.nextFloat();

        float a=x+y;
        float b=a/y;
        System.out.printf("%.5f",b-1);
    }
}

/*
Time Dilation
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Newton wants to study for an exam and he wants H more hours, He knows a planet where time passes S times faster than earth. Which means that t hours on earth is equal to S x t hours on that planet.

Now Newton travels to that planet and studies for H hours, Find out how many how many hours passed on earth.
Input
The first and only line of the input contains two integers H and S

Constraints:
1 ≤ H ≤ 100
1 ≤ S ≤ 100
Output
Output the time passed on earth and print the answer upto 5 decimal places.
Example
Sample Input 1:
8 3

Sample Output 1:
2.66667


Sample Input 2:
1 10

Sample Output 2:
0.10000
 */
