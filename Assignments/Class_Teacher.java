package Assignments;
import java.util.*;
public class Class_Teacher {
    static class Teacher {
        String name;
        int age;
        private int salary;

        Teacher(String name, int age, int salary) {
            this.name = name;
            this.age = age;
            this.salary = salary;
        }

        public void printDetails() {
            System.out.println("Name: " + this.name);
            System.out.println("Age: " + this.age);
            System.out.println("Salary:  " + this.salary);
        }
    }

    class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String name = sc.next();
            int age = sc.nextInt();
            int salary = sc.nextInt();
            Teacher obj = new Teacher(name, age, salary);
            obj.printDetails();
        }
    }
}



/*
Class Teacher
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Create a class Teacher with name, age, and salary attributes, where salary must be a private attribute that cannot be accessed outside the class.
Print the details of the teacher including salary.
Input
The first line contains the name, the second line contains the age and the third line contains the salary of the teacher.

Constraints:
20<=age<=80
Output
Prints the details of the teacher in the following format:
Name:
Age:
Salary:
Example
Sample Input:
raj
22
20000

Sample Output:
Name: raj
Age: 22
Salary: 20000
 */
