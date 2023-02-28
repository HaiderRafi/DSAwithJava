package Question_Of_The_Day;
import java.util.*;
public class Squares_and_Cubes {
    public static void main (String[] args) {
        // Your code here
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        double b=Math.pow(a,2);
        double c=Math.pow(a,3);
        // System.out.println(a+b+c);
        System.out.println(String.format("%.0f", a+b+c));
    }
}
