package Question_Of_The_Day;

import java.util.Scanner;

public class Right_Prime {
    public static void main (String[] args) {
        // Your code here
        Scanner sc= new Scanner(System.in);
        int N= sc.nextInt();

        if(isPrime(N)==true){
            System.out.print(N);
        }else{
            System.out.println(nextPrime(N));

        }

    }

    static boolean isPrime(int n)
    {
        // Corner cases
        if (n <= 1) return false;
        if (n <= 3) return true;

        // This is checked so that we can skip
        // middle five numbers in below loop
        if (n % 2 == 0 || n % 3 == 0) return false;

        for (int i = 5; i * i <= n; i = i + 6)
            if (n % i == 0 || n % (i + 2) == 0)
                return false;

        return true;
    }

    static int nextPrime(int N)
    {

        // Base case
        if (N <= 1)
            return 2;

        int prime = N;
        boolean found = false;

        // Loop continuously until isPrime returns
        // true for a number greater than n
        while (!found)
        {
            prime++;

            if (isPrime(prime))
                found = true;
        }

        return prime;
    }
}

/*
Right Prime
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Find the minimum prime number greater than or equal to X.
Input
The only line of the input contains a single integer X

Constraints:
2 ≤ X ≤ 105
Output
Print the answer
Example
Sample Input 1:
20

Sample Output 1:
23

Sample Input 2:
99992

Sample Output 2:
100003

Sample Input 3:
2

Sample Output 3:
2

Sample Explanation 1:
The minimum prime number greater than or equal to 20 is 23.
 */
