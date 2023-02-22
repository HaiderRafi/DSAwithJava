package Assignments;
import java.util.*;
public class Student_Grades {
    public static void main (String[] args) {
        // Your code here
        Scanner input =new Scanner(System.in);
        int a =input.nextInt();
        int b =input.nextInt();
        int c =input.nextInt();
        int d =input.nextInt();
        int e =input.nextInt();

        int sum= a+b+c+d+e;
        int per = sum*100/500;
//        System.out.println(per);

//        System.out.println(sum);
        if(per>=80){
            System.out.println('A');
        } else if (per<80 && per>=60) {
            System.out.println('B');

        } else if (per<60 && per>=40) {
            System.out.println('C');

        }else {
            System.out.println('D');
        }
    }
}

/*
Student Grades
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given marks of a student in 5 subjects. You need to find the grade that a student would get on the basis of the percentage obtained. Grades computed are as follows:
If the percentage is >= 80 then print Grade ‘A’
If the percentage is <80 and >=60 then print Grade ‘B’
If the percentage is <60 and >=40 then print Grade ‘C’
else print Grade ‘D’
Input
The input contains 5 integers separated by spaces.

Constraints:
1 ≤ marks ≤ 100
Output
You need to print the grade obtained by a student.
Example
Sample Input:
75 70 80 90 100

Sample Output:
A

Explanation
((75+70+80+90+100)/5)*100=83%
A grade.
 */
