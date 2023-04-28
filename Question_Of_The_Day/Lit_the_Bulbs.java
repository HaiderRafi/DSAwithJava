package Question_Of_The_Day;
import java.util.*;
public class Lit_the_Bulbs {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        sol(scanner);
        scanner.close();
    }

    public static void sol(Scanner scanner) {
        char[] c = scanner.nextLine().trim().toCharArray();
        Arrays.sort(c);
        if (c[0] == c[3]) {
            System.out.println("-1");
        } else if (c[0] == c[2] || c[1] == c[3]) {
            System.out.println("6");
        } else {
            System.out.println("4");
        }
    }
}


/*
Lit the Bulbs
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
You have a garland consisting of 4 colored light bulbs, the color of the i- th light bulb is si.
Initially, all the light bulbs are turned off. Your task is to turn all the light bulbs on. You can perform the following operation any number of times: select a light bulb and switch its state (turn it on if it was off, and turn it off if it was on). The only restriction on the above operation is that you can apply the operation to a light bulb only if the previous operation was applied to a light bulb of a different color (the first operation can be applied to any light bulb).
Calculate the minimum number of operations to turn all the light bulbs on, or report that this is impossible.
Input
The input contains s — a sequence of 4 characters, where each character is a decimal digit. The i- th character denotes the color of the i- th light bulb.
Output
Print one integer denoting the minimum number of operations to turn all the light bulbs on. If it is impossible to turn all the bulbs on, print -1.
ai_logoAI CODELENS
BETA
Simpler Explanation
Concepts Used
Example
Sample Input 1
9546
Sample Output 1
4

Sample Input 2
0000
Sample Output 2
-1
 */
