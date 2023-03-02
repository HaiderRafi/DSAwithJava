package Question_Of_The_Day;
import java.util.*;
public class Grid_Degrade {
    public static void main (String[] args) {
        // Your code here
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        sc.nextLine();
        char[][] array= new char[n][];
        boolean rowArray[]=new boolean[n];
        boolean columnArray[]=new boolean[m];

        for(int i=0;i<n;i++){
            array[i]=sc.nextLine().toCharArray();
            for(int j=0;j<m;j++){
                if(array[i][j]=='#'){
                    rowArray[i]=true;
                    columnArray[j]=true;
                }
            }
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n;i++){
            if(!rowArray[i]){
                continue;
            }
            for(int j=0;j<m;j++){
                if(columnArray[j]){
                    sb.append(array[i][j]);
                }
            }
            sb.append('\n');
        }
        System.out.println(sb.toString());
    }
}


/*
Grid Degrade
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Newton is given a grid A of N rows and M columns consisting of 2 colors, red and blue.

He is not very fond of the color red so he wants to remove all the rows and columns that contain only red color cells.

Print the final matrix that Newton is left with after removing all red rows and red columns.

(Note: The given matrix is of N rows and M columns. The cell at i-th row and j-th column, Ai, j , contains a '. ' if it contains red color otherwise a '#' if it contains the color blue. )
Input
The first line of the input contains two integers N and M
Each of the next N lines contains a string of M characters representing the grid A.

Constraints:
1 ≤ N, M ≤ 100
Ai, j is either '. ' or '#'
Output
Output the resultant grid
Example
Sample Input 1:
5 5
##. #.
. .
##. #.
. #. #.
#..

Sample Output 1:
###
###
. ##
#..

Explanation:
The second row, third column and fifth column will be removed


Sample Input 2:
4 4
. .
. .
. #.
. .

Sample Output 2:
#
 */
