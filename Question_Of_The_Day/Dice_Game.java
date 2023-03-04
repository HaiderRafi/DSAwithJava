package Question_Of_The_Day;
import java.util.*;
public class Dice_Game {
    public static void main (String[] args) {
        // Your code here
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

        if(6*a>=b && b>=a){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}


/*
Dice Game
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Is it possible to get a sum of B when throwing a die with six faces 1, 2, …, 6 A times?
Input
The input consists of two space-separated integers.
A B

Constraints
1≤A≤100
1≤B≤1000
A and B are integers.
Output
If it is possible to get a sum of B, print Yes; otherwise, print No.
Example
Sample Input 1
2 11
Sample Output 1
Yes

Sample Input 2
2 13
Sample Output 2
No
 */