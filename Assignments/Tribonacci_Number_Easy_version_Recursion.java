package Assignments;
import java.util.*;
public class Tribonacci_Number_Easy_version_Recursion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int firstTerm = 0, secondTerm = 0, thirdTerm = 1;

        for (int i = 1; i < n; ++i) {

            // compute the next term
            int nextTerm = firstTerm + secondTerm + thirdTerm;
            firstTerm = secondTerm;
            secondTerm = thirdTerm;

            thirdTerm = nextTerm;
        }
        System.out.print(firstTerm);
    }
}
