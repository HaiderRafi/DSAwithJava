package Question_Of_The_Day;
import java.util.*;
public class Candies_Division {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        int sum = 0, count1 = 0, count2 = 0;

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
            if (a[i] == 1) {
                count1++;
            }
            if (a[i] == 2) {
                count2++;
            }
            sum = sum + a[i];
        }
        if (sum % 2 != 0) {
            System.out.println("No");
        } else if ((count1 % 2 == 0 && count2 % 2 != 0 && count1 != 0) || (count1 % 2 == 0 && count2 % 2 == 0)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}



/*
Candies Division
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Edward and George received n candies from their parents. Each candy weighs either 1 gram or 2 grams. Now they want to divide all candies among themselves fairly so that the total weight of Edward's candies is equal to the total weight of George's candies. Check if they can do that.
Note: Candies are not allowed to be cut in half.
Input
The first line of the input consists of an integer n. The next line contains n integers a1, a2, …, an denoting the weights of the candies.

Constraints
1 ≤ n ≤ 100
Output
Print Yes if all candies can be divided into two sets with the same weight; No otherwise.
ai_logoAI CODELENS
BETA
Simpler Explanation
Concepts Used
Example
Sample Input 1
2
1 1
Sample Output 1
Yes

Sample Input 2
2
1 2
Sample Output 2
No
 */
