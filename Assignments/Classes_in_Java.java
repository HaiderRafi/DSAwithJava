package Assignments;

public class Classes_in_Java {
}
//Copy And Paste The Code

/*
static class Student
{
    //Enter your code here
    String name;
    int eng;
    int maths;
    int hindi;
}
static Student[] createStudentArray(int n)
    {
       //Enter your code here
       Student[] st=new Student[n];

    //    Student obj=new Student();

       for(int i=0; i<n;i++){
           st[i]=new Student();
           st[i].name= sc.next();
           st[i].eng=sc.nextInt();
           st[i].maths=sc.nextInt();
           st[i].hindi=sc.nextInt();

       }
       return st;
    }

    static int engAverage(Student st[], int n)
    {
        //Enter your code here
        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum+st[i].eng;
        }
        return sum/n;
    }

    static int avgPercentageOfClass(Student st[], int n)
    {
        //Enter your code here
        int avg=0;
        int sum=0;
        for(int i=0;i<n;i++){
            sum=0;
            sum=sum+st[i].eng+st[i].hindi+st[i].maths;
            avg=avg+sum/3;
            //

        }
        return avg/n;
    }
 */





/*
Classes in Java
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
In this question, you need to create a class Student which has 4 parameters:-
name ( String )
eng (int)
maths (int)
hindi (int)

Also, you need to complete the given three functions:-
createStudentArray:- In which you need to create an array of students and take input
engAverage:- In which you need to create an average of marks in English.
avgPercentageOfClass:- In which you need to calculate the average percentage of the class.

Note:- Scanner is already defined in this question. Use "sc" for scanner.
Input
You need to take the input in createStudentArray() only in which you have already provided the number of students N you just have to create an array of size N and take input respectively.

Constraints:-
1 <= N <= 1000
Output
Return the Student array in createStudentArray(), Return the floor of average marks in english in engAverage, and return the floor of average percentage of the class in .

Note:- In avgPercentageOfClas you first need to create the average of individual then find the average of all the students.
Example
Sample Input:-
3
Shiv 65 47 78
Negi 55 40 56
Gargi 43 56 40

Sample Output:-
54
53

Explanation:-
Average marks in eng = (65 + 55 + 43)/3 = 163/3 = 54
Average percentage of class =>
shiv = (65 + 47 + 78)/3 = 190/3 = 63
Negi = (55 + 40 + 56)/3 = 151/3 = 50
Gargi = (43 + 56 + 40)/3 = 139/3 = 46
avg = (63 + 50 + 46 )/3 = 159 = 53
 */
