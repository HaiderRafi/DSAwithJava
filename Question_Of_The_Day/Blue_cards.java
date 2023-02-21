package Question_Of_The_Day;

import java.util.Scanner;

public class Blue_cards {
    public static void main (String[] args) {
        // Your code here
        Scanner sc= new Scanner(System.in);
        long N= sc.nextLong();
        long A= sc.nextLong();
        long B= sc.nextLong();

        // long x= A+B;

        if(A==0){
            System.out.println(A);
        }
        else if(N<A){
            System.out.println(N);
        }else if(N==A){
            // long p= N-x;
            System.out.println(A);

        }else if(N>A){
            if(N%A==0){
                long d=(N/(A+B));
                System.out.println(d*A);
            }else{
                long m=A*(N/(A+B));
                long n=N%(A+B);
                if(n>A){
                    System.out.println(m+A);
                }else{
                    System.out.println(m+n);
                }
            }
        }
    }
}

/*
Blue cards
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Alice wants to play game of cards. Alice has two types of cards, red and blue. Initially, there is no card placed. Alice places cards in order. Firstly he places A blue cards, then places B red cards, repeatedly.
How many blue cards will be there among the first N cards in the row of cards made this way?
Input
The first line contains three integers, N, A, and B.

Constraints:
1 <= N <= 1018
A, B >= 0
0 < A+B <= 1018
Output
Print the number of blue cards that will be there among the first N cards in the row of cards.
Example
Sample Input 1
8 3 4

Sample Output 1
4
Let b denote a blue card, and r denote a red card. The first eight cards in the row will be bbbrrrrb, among which there are four blue cards.

Sample Input 2
8 0 4

Sample Output 2
0
He placed only red cards from the beginning.

Sample Input 3
6 2 4

Sample Output 3
2
Among bbrrrr, there are two blue cards.
 */