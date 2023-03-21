package Question_Of_The_Day;
import java.util.*;

//copied from GFG
public class Emilia_and_Strings {
    public static void main (String[] args) {
        // Your code here
        Scanner sc=new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        nPermute(str.toCharArray(), n);
    }
    static void nPermute(char[] str, int n)
    {
        // Sort the string in lexicographically
        // ascending order
        Arrays.sort(str);

        // Keep iterating until
        // we reach nth position
        int i = 1;
        do {
            // check for nth iteration
            if (i == n)
                break;

            i++;
        } while (next_permutation(str));

        // print string after nth iteration
        System.out.println(String.valueOf(str));
    }

    static boolean next_permutation(char[] p)
    {
        for (int a = p.length - 2; a >= 0; --a)
            if (p[a] < p[a + 1])
                for (int b = p.length - 1;; --b)
                    if (p[b] > p[a])
                    {
                        char t = p[a];
                        p[a] = p[b];
                        p[b] = t;
                        for (++a, b = p.length - 1; a < b; ++a, --b)
                        {
                            t = p[a];
                            p[a] = p[b];
                            p[b] = t;
                        }
                        return true;
                    }
        return false;
    }
}



/*
Emilia and Strings
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Emilia loves to play with strings. Help her find the K- th lexicographically smallest string among the strings that are permutations of a string S.
Input
The input consists of a string and an integer separated by a space.
S K

Constraints
1 ≤ ∣S∣ ≤ 8
S consists of lowercase English letters.
There are at least K distinct strings that are permutations of S.
Output
Print the answer.
Example
Sample Input 1
aab 2
Sample Output 1
aba

Sample Input 2
baba 4
Sample Output 2
baab

Sample Input 3
ydxwacbz 40320
Sample Output 3
zyxwdcba
 */
