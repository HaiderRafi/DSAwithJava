package Question_Of_The_Day;
import java.util.*;
public class Magic_Digits {
    public static void main (String[] args) {
        // Your code here
        Scanner input = new Scanner(System.in);
        String s = input.next();
        int counter = 0;
        int len = s.length();
        while (len > 1) {
            int sum = 0;
            for (int i = 0; i < len; i++) {
                sum += s.charAt(i) - '0';
            }
            s = Integer.toString(sum);
            len = s.length();
            ++counter;
        }
        System.out.println(counter);
    }
}


/*
Magic Digits
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Having watched the last Harry Potter film, little Gerald also decided to practice magic. He found in his father's magical book a spell that turns any number in the sum of its digits. At the moment Gerald learned that, he came across a number n. How many times can Gerald put a spell on it until the number becomes one- digit?
Input
The input consists of an integer n.

Constraints
0 ≤ n ≤ 10100000
Output
Print the number of times a number can be replaced by the sum of its digits until it only contains one digit.
Example
Sample Input 1
10
Sample Output 1
1

Sample Input 2
991
Sample Output 2
3
 */
