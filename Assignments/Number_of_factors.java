package Assignments;
import java.util.*;
public class Number_of_factors {
    static Vector<Integer> allPrimes = new Vector<Integer>();
    // Fills above vector allPrimes[] for a given n
    static void sieve(int n) {
        // Create a boolean array "prime[0..n]" and
        // initialize all entries it as true. A value
        // in prime[i] will finally be false if i is
        // not a prime, else true.
        boolean[] prime = new boolean[n + 1];

        for (int i = 0; i <= n; i++)
            prime[i] = true;

        // Loop to update prime[]
        for (int p = 2; p * p <= n; p++) {
            // If prime[p] is not changed, then it
            // is a prime
            if (prime[p] == true) {
                // Update all multiples of p
                for (int i = p * 2; i <= n; i += p)
                    prime[i] = false;
            }
        }
        // Store primes in the vector allPrimes
        for (int p = 2; p <= n; p++)
            if (prime[p])
                allPrimes.add(p);
    }

    // Function to find all result of factorial number
    static long factorialDivisors(int n) {
        sieve(n); // create sieve

        // Initialize result
        long result = 1;

        // find exponents of all primes which divides n
        // and less than n
        for (int i = 0; i < allPrimes.size(); i++) {
            // Current divisor
            long p = allPrimes.get(i);

            // Find the highest power (stored in exp)'
            // of allPrimes[i] that divides n using
            // Legendre's formula.
            long exp = 0;
            while (p <= n) {
                exp = exp + (n / p);
                p = p * allPrimes.get(i);
            }

            // Multiply exponents of all primes less
            // than n
            result = result * (exp + 1);
        }

        // return total divisors
        return result;
    }

    // Driver program to run the cases
    public static void main(String[] args) {
        // your code is here
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            System.out.println(factorialDivisors(n));
        }

    }
}



/*
Number of factors
medium
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given a integer N, your task is to calculate the number of divisors in factorial of N.
Input
Input contains a single integer depicting value of N.

Constraints:-
1 < = N < = 100
Output
Print the number of divisors in N!.
Example
Sample Input:-
3

Sample Output:-
4

Sample Input:-
5

Sample Output:-
16
 */
