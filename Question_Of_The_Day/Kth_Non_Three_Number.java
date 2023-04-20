package Question_Of_The_Day;
import java.util.*;
public class Kth_Non_Three_Number {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        scanner.close();

        // Initialize the sequence with the first two elements
        List<Integer> sequence = new ArrayList<>(Arrays.asList(1, 2));

        // Generate the sequence
        int i = 3;
        while (sequence.size() < k) {
            if (i % 3 != 0 && i % 10 != 3) {
                sequence.add(i);
            }
            i++;
        }

        // Print the kth element
        System.out.println(sequence.get(k-1));
    }
}


/*
Kth Non-Three Number
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Akash doesn't like integers that are divisible by 3 or end with the digit 3 in their decimal representation. Integers that meet both conditions are disliked by Akash, too. Akash starts to write out the positive (greater than 0) integers which he likes: 1, 2, 4, 5, 7, 8, 10, 11, 14, 16, …. Output the kth element of this sequence (the elements are numbered from 1).
Input
The input consists of an integer k.

Constraints
1 ≤ k ≤ 1000
Output
Print one integer x denoting the kth element of the sequence that was written out by Akash.
ai_logoAI CODELENS
BETA
Simpler Explanation
Concepts Used
Example
Sample Input 1
2
Sample Output 1
2

Sample Input 2
3
Sample Output 2
4
 */
