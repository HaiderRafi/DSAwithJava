package Assignments;
import java.util.*;
public class Consonants {
    public static void main (String[] args) {
        // Your code here
        Scanner input= new Scanner(System.in);
        String s= input.nextLine();

        for(int i =0; i<s.length(); i++){
            char ch= s.charAt(i);
            if(ch=='a'|| ch=='e'|| ch=='i'||ch=='o'||ch=='u'){
                continue;
            }
            System.out.print(ch);
        }
    }
}

/*
Consonants
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given a string s. Print the string after removing all vowels.
Input
The only line of input contains a string of lowercase characters.

1 <= |S| <= 100000
Output
Print the string after removing all vowels.
Example
Sample Input 1:
dtcpt

Output:
dtcpt

Explanation:
There are no vowels in this string.

Sample Input 2:
ehoqggi

Output:
hqgg

Explanation:
There are three vowels in this string 'i' , 'e' and 'o'.
 */