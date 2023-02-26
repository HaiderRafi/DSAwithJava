package Question_Of_The_Day;
import java.util.*;
public class Finding_Character {
    public static void main (String[] args) {
        // Your code here

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int x = input.nextInt();
        int start = (int) 'A'; // start character
        int offset = x - 1; // index offset
        int index = (offset / n) + start; // calculate the ASCII value of the character
        char result = (char) index; // cast the ASCII value to a character
        System.out.println(result);
    }
}




/*
Finding Character
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Find the X- th character from the beginning of the string that is obtained by concatenating these characters: N copies of A's, N copies of B's, …, and N copies of Z's, in this order.
Input
The input consists of two space separated integers.
N X

Constraints
1≤N≤100
1≤X≤N≤26
All values in input are integers.
Output
Print the answer.
Example
Sample Input 1
1 3
Sample Output 1
C

Sample Input 2
2 12
Sample Output 2
F
 */
