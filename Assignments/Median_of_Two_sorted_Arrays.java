package Assignments;
import java.util.*;
public class Median_of_Two_sorted_Arrays {
    static float getMedian(int ar1[], int ar2[], int n, int m) {

        // Current index of input array ar1[]
        int i = 0;

        // Current index of input array ar2[]
        int j = 0;
        float count;
        float m1 = -1, m2 = -1;

        // Since there are (n+m) elements,
        // There are following two cases
        // if n+m is odd then the middle
        // index is median i.e. (m+n)/2
        if ((m + n) % 2 == 1) {
            for (count = 0; count <= (n + m) / 2; count++) {
                if (i != n && j != m) {
                    m1 = (ar1[i] > ar2[j]) ? ar2[j++]
                            : ar1[i++];
                } else if (i < n) {
                    m1 = ar1[i++];
                }

                // for case when j<m,
                else {
                    m1 = ar2[j++];
                }
            }
            return m1;
        }

        // median will be average of elements
        // at index ((m+n)/2 - 1) and (m+n)/2
        // in the array obtained after merging
        // ar1 and ar2
        else {
            for (count = 0; count <= (n + m) / 2; count++) {
                m2 = m1;
                if (i != n && j != m) {
                    m1 = (ar1[i] > ar2[j]) ? ar2[j++]
                            : ar1[i++];
                } else if (i < n) {
                    m1 = ar1[i++];
                }

                // for case when j<m,
                else {
                    m1 = ar2[j++];
                }
            }
            return (m1 + m2) / 2;
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int m = sc.nextInt();
            int n = sc.nextInt();
            int a[] = new int[m];
            int b[] = new int[n];

            for (int indexA = 0; indexA < m; indexA++) {

                a[indexA] = sc.nextInt();
            }
            for (int indexB = 0; indexB < n; indexB++) {
                b[indexB] = sc.nextInt();
            }
            float ans = getMedian(a, b, m, n);
            System.out.printf("%.2f", ans);
        }
    }
}



/*
Median of Two sorted Arrays
medium
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given two sorted arrays A and B of size n and m respectively, return the median of the two sorted arrays.
Input
The first line of input contains n, m the length of arrays A and B.
The next two lines contain the input of arrays A and B.

Constraints
1 ≤ n, m ≤ 1000
-106 ≤ A[i], B[i] ≤ 106
Output
Print the median of two sorted arrays upto two decimal places.
Example
Sample Input :
2 1
1 3
2

Sample Output :
2.00
 */
