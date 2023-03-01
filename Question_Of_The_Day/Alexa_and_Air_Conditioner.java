package Question_Of_The_Day;
import java.util.*;
public class Alexa_and_Air_Conditioner {
    public static void main (String[] args) {
        // Your code here
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        if(n>=30){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}




/*
Alexa and Air Conditioner
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Alexa will turn on the air conditioner if, and only if, the temperature of the room is 30 degrees Celsius or above. The current temperature of the room is X degrees Celsius. Will she turn on the air conditioner?
Input
The input consists of a single integer X.

Constraints
−40≤X≤40
X is an integer.
Output
Print Yes if you will turn on the air conditioner; print No otherwise.
Example
Sample Input 1
25
Sample Output 1
No

Sample Input 2
30
Sample Output 2
Yes
 */
