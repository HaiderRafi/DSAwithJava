package Question_Of_The_Day;
import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Cards_Shuffle {
    static Main2 admin = new Main2();
    public static void main(String[] args) {
        admin.start();
    }
}
class Main2 {
    //---------------------------------INPUT READER-----------------------------------------//
    public BufferedReader br;
    StringTokenizer st = new StringTokenizer("");
    String next() {
        while (!st.hasMoreTokens()) {
            try { st = new StringTokenizer(br.readLine());} catch (IOException e) { e.printStackTrace(); }
        }
        return st.nextToken();
    }
    int ni() { return Integer.parseInt(next()); }
    long nl() { return Long.parseLong(next()); }
    double nd() { return Double.parseDouble(next()); }
    String ns() { return next(); }
    int[] na(long n) {int[]ret=new int[(int)n]; for(int i=0;i<n;i++) ret[i]=ni(); return ret;}
    long[] nal(long n) {long[]ret=new long[(int)n]; for(int i=0;i<n;i++) ret[i]=nl(); return ret;}
    Integer[] nA(long n) {Integer[]ret=new Integer[(int)n]; for(int i=0;i<n;i++) ret[i]=ni(); return ret;}
    Long[] nAl(long n) {Long[]ret=new Long[(int)n]; for(int i=0;i<n;i++) ret[i]=nl(); return ret;}
    //--------------------------------------PRINTER------------------------------------------//
    PrintWriter w;
    void p(int i) {w.println(i);} void p(long l) {w.println(l);}
    void p(double d) {w.println(d);} void p(String s) { w.println(s);}
    void pr(int i) {w.print(i);} void pr(long l) {w.print(l);}
    void pr(double d) {w.print(d);} void pr(String s) { w.print(s);}
    void pl() {w.println();}
    //--------------------------------------VARIABLES-----------------------------------------//
    long lma = Long.MAX_VALUE, lmi = Long.MIN_VALUE;
    int ima = Integer.MAX_VALUE, imi = Integer.MIN_VALUE;
    long mod = 1000000007;
    {
        w = new PrintWriter(System.out);
        br = new BufferedReader(new InputStreamReader(System.in));
    }
    //----------------------START---------------------//
    void start() {
//        int t = ni(); while(t-- > 0)
        solve();
        w.close();
    }
    void solve() {
        int n = ni();
        int[] freq = new int[n];
        for(int i = 0; i < 4*n-1; i++) {
            freq[ni()-1]++;
        }
        for(int i = 0; i < n; i++) {
            if(freq[i] < 4) {
                p((i+1));
                return;
            }
        }
    }
}
/*
Cards Shuffle
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
We have 4 cards with an integer 1 written on it, 4 cards with 2, …, 4 cards with N, for a total of 4N cards.
Alexa shuffled these cards, removed one of them, and gave you a pile of the remaining 4N−1 cards. The i- th card (1≤i≤4N−1) of the pile has an integer Ai written on it.

Find the integer written on the card removed by Alexa.
Input
The first line of input contains an integer N.
The second line contains N space separated integers as follows:

N
A1 A2. . AN

Constraints
1≤N≤10^5
1≤Ai≤N(1≤i≤4N−1)
For each k(1≤k≤N), there are at most 4 indices i such that Ai=k.
All values in input are integers.
Output
Print the answer.
Example
Sample Input 1
3
1 3 2 3 3 2 2 1 1 1 2
Sample Output 1
3

Sample Input 2
1
1 1 1
Sample Output 2
1

Sample Input 3
4
3 2 1 1 2 4 4 4 4 3 1 3 2 1 3
Sample Output 3
2
 */
