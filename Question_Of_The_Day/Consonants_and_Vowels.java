package Question_Of_The_Day;
import java.util.*;
public class Consonants_and_Vowels {
    public static void main (String[] args) {
        // Your code here
        Scanner sc=new Scanner(System.in);
        String s=sc.next();

        int count=0;
        int count2=0;
        for(int i=0;i<s.length();i++){


            // System.out.println(s.charAt(i));
            if(s.charAt(i)=='a'){
                count++;
            }
            if(s.charAt(i)=='e'){
                count++;
            }
            if(s.charAt(i)=='i'){
                count++;
            }
            if(s.charAt(i)=='o'){
                count++;
            }
            if(s.charAt(i)=='u'){
                count++;
            }
            if(s.charAt(i)!='a'&&s.charAt(i)!='e'&&s.charAt(i)!='i'&&s.charAt(i)!='o'&&s.charAt(i)!='u'){
                count2++;
            }
        }

        if(count==count2){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }


    }
}



/*
Consonants and Vowels
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Alexa loves to play with strings. She wants to know if her string consists of an equal number of consonants and vowels or not. Print Yes if the number of consonants is equal to the number of vowels.
Input
The input consists of a string S.

Constraints
S consists of lower case English alphabets.
Output
Print Yes if the number of vowels and consonants are equal else print No.
starsASK AI
BETA
Simpler Explanation
Concepts Used
Example
Sample Input 1
aebecd
Sample Output 1
Yes

Sample Input 2
newton
Sample Output 2
No
 */
