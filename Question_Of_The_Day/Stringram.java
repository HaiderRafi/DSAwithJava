package Question_Of_The_Day;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.io.*; // for handling input/output

public class Stringram {
    public static void main (String[] args) {
        // Your code here
        Scanner sc= new Scanner(System.in);

        int n= sc.nextInt();
        long count=0;
        HashMap<String, Long>map =new HashMap<String,Long>();

        for(int  i=0; i<n;i++){
            char[]ch=sc.next().toCharArray();
            Arrays.sort(ch);
            String str= new String(ch);
            if(map.containsKey(str)){
                map.put(str,map.get(str)+1);
                count+=map.get(str);
            }else{
                map.put(str,(long)0);
            }
        }
        System.out.println(count);
    }
}

/*
Stringram
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
We define a Stringram of a string as the string that can be formed by rearranging the given string.

For example, "tewnon" is the Stringram of "newton".

Einstein has given Newton N distinct strings S1, S2,. ., SN each containing 10 lowercase characters. Now, he wants Newton to count the number of pairs i, j (1 ≤ i < j ≤ N) such that the string Si is the Stringram of Sj.
Input
The first line of the input contains a single integer N
The i- th of the N lines contains a string Si of length 10

Constraints:
1) 2 ≤ N ≤ 2 x 105
Output
Output the answer in a single line
Example
Sample Input 1:
3
nocrtsatni
atomcastic
constraint

Sample Output 1:
1

Sample Explanation 1:
The only valid pair is S1 and S3.


Sample Input 2:
5
abaaaaaaaa
oneplustwo
aaaaaaaaba
twoplusone
aaaabaaaaa

Sample Output 2:
4
 */
