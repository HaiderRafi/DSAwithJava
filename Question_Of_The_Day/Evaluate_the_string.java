package Question_Of_The_Day;
import java.util.*;
public class Evaluate_the_string {
    public static void main (String[] args) {
        // Your code here
        Scanner sc=new Scanner(System.in);
        String str=sc.next();

        char one=str.charAt(0);
        char two=str.charAt(2);

        System.out.println(Character.getNumericValue(one)*Character.getNumericValue(two));
    }
}
