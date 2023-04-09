package Question_Of_The_Day;
import java.util.Scanner;
public class Replace_Tires {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long  minBuses=0;
        long  maxBuses=0;
        if(n%4==0 && n%6==0)
        {
            minBuses=n/6;
            maxBuses=n/4;
        }
        else if(n%4!=0 && n%6==0)
        {
            minBuses=n/6;
            maxBuses=n/4;
        }
        else if(n%4!=0 && n%6!=0)
        {
            long min=n%6;
            minBuses=n/6;
            if(min/4>0)
            {
                minBuses=min/4+minBuses;
                maxBuses=n/4;
            }
            else{
                System.out.println("-1");
                return;
            }
        }
        else if(n%4==0 && n%6!=0)
        {
            long min=n%6;
            if(min/4>0)
            {
                minBuses=n/6+1;
                maxBuses=n/4;
            }
            else{
                minBuses=(n/6-1)+(min+6)/4;
                maxBuses=n/4;
            }
        }
        System.out.println(minBuses + " " + maxBuses);
    }
}



/*
Replace Tires
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Spring has come, and the management of the AvtoBus bus fleet has given the order to replace winter tires with summer tires on all buses. You own a small bus service business and you have just received an order to replace n tires. You know that the bus fleet owns two types of buses: with two axles (these buses have 4 wheels) and with three axles (these buses have 6 wheels).
You don't know how many buses of which type the AvtoBus bus fleet owns, so you wonder how many buses the fleet might have. You have to determine the minimum and the maximum number of buses that can be in the fleet if you know that the total number of wheels for all buses is n.
Input
The input consists of an integer n denoting the number of wheels for all buses.

Constraints
1 ≤ n ≤ 1018
Output
Print two integers x and y (1 ≤ x ≤ y) — the minimum and the maximum possible number of buses that can be in the bus fleet. If there is no suitable number of buses for the given n, print the number −1 as the answer.
ai_logoNEWTON AI
BETA
Simpler Explanation
Concepts Used
Example
Sample Input 1
4
Sample Output 1
1 1

Sample Input 1
7
Sample Output 1
-1
 */
