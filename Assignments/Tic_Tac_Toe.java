package Assignments;
import java.util.*;
public class Tic_Tac_Toe {
    public static void main (String[] args) {
        // Your code here
        Scanner sc=new Scanner(System.in);

        char c1=sc.next().charAt(0);
        char c2=sc.next().charAt(0);

        if(c1=='R' || c2=='R'){
            System.out.println('R');
        }
        else{ // J is there -> other one is winner // J is not other -> D
            if(c1=='J'){
                System.out.println(c2);
            }
            else if(c2=='J'){
                System.out.println(c1);
            }
            else{
                System.out.println("D");
            }
        }
    }
}

/*
Tic Tac Toe
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Rick's family and Jerry are playing Tic Tac Toe. Rules are simple:
Game is played in pairs.
If Rick plays against anyone, Rick wins.
If Jerry plays against anyone, Jerry Loses.
A game between any other players is a draw.
Given a pair of players, find who wins the game or if the game is draw.
Input
Input Contains two space separated characters denoting the players that will have the match.
R denotes Rick.
J denotes Jerry.
B denotes Beth.
M denotes Morty.
S denotes Summer.
Output
If the game is draw print 'D', else print the first letter of the name of the player who wins in capital.
Example
Sample Input 1
R S

Sample Output 1
R

Sample Input 2
B J

Sample Output 2
B

Sample Input 3
M S

Sample Output 3
D
 */
