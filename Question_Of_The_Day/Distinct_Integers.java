package Question_Of_The_Day;
import java.util.*;
public class Distinct_Integers {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();

        Set<Integer> distinctIntegers = new HashSet<>();
        distinctIntegers.add(a);
        distinctIntegers.add(b);
        distinctIntegers.add(c);
        distinctIntegers.add(d);
        distinctIntegers.add(e);

        System.out.println(distinctIntegers.size());
    }
}


/*
Distinct Integers
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Emilia loves to play with integers. Print how many distinct integers there are in given five integers
A, B, C, D, and E.
Input
The input consists of 5 space-separated integers.
A B C D E

Constraints
0 ≤ A, B, C, D, E ≤ 100
All values in the input are integers.
Output
Print the answer.
Example
Sample Input 1
31 9 24 31 24

Sample Output 1
3

Sample Input 2
0 0 0 0 0

Sample Output 2
1
 */
