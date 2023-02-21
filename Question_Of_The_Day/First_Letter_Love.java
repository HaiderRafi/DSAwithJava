package Question_Of_The_Day;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class First_Letter_Love {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] words = new String[n];
        for (int i = 0; i < n; i++) {
            words[i] = sc.next();
        }
        Set<String> usedWords = new HashSet<String>();
        boolean valid = true;
        for (int i = 1; i < n; i++) {
            String prevWord = words[i-1];
            String currWord = words[i];
            if (prevWord.charAt(prevWord.length()-1) != currWord.charAt(0)) {
                valid = false;
                break;
            }
            if (usedWords.contains(currWord)) {
                valid = false;
                break;
            }
            usedWords.add(currWord);
        }
        if (valid) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }


    }
}
/*
First Letter Love
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Newton has a sequence of N words. He wants to make sure that all the words after the first word follow a specific pattern i. e. they should start with letter same as the previous word ending letter and they should not have occurred before.

You are given all the words, tell whether they follow the pattern set by Newton or not. Print "Yes" if they follow, otherwise print "No"
Input
The first line of the input consists of an integer N
Each of the next N lines contains a string Si

Constraints:
2 <= N <= 105
1 <= |Si| <= 100
Output
Output the answer.
Example
Sample Input 1:
3
newton
school
discord

Sample Output 1:
No

Explanation:
2nd and 3rd word doesn't start with the previous word ending letter


Sample Input 2:
3
newton
newton
newton

Sample Output 2:
No

Explanation:
Same word "newton" occurring multiple times


Sample Input 3:
3
yash
hsay
yay

Sample Output 3:
Yes
 */
