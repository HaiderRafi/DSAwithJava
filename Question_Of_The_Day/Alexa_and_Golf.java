package Question_Of_The_Day;
import java.util.*;
public class Alexa_and_Golf {
    public static void main (String[] args) {
        // Your code here
        Scanner sc= new Scanner(System.in);
        int k=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();

        int yes=0;
        int no=0;
        for(int i=a;i<=b;i++){
            if(i%k==0){
                yes++;
            }
            else{
                no++;
            }
        }

        if(yes>=1){
            System.out.println("OK");
        }else{
            System.out.println("NG");
        }
    }
}




/*
Alexa and Golf
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Alexa will practice golf. Her objective is to get a carry distance that is a multiple of K, while she can only make a carry distance of between A and B (inclusive).
If she can achieve the objective, print OK; if he cannot, print NG.
Input
The first line of the input contains a single integer K denoting carry distance
The second line of the input contains two space-separated integers A and B denoting the range.

Constraints
All values in the input are integers.
1 ≤ A ≤ B ≤ 1000
1 ≤ K ≤ 1000
Output
If she can achieve the objective, print OK; if he cannot, print NG.
Example
Sample Input 1
7
500 600
Sample Output 1
OK

Sample Input 2
4
5 7
Sample Output 2
NG

Sample Input 3
1
11 11
Sample Output 3
OK
 */
