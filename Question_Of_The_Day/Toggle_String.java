package Question_Of_The_Day;
import java.util.*;
public class Toggle_String {
    public static void main (String[] args) {
        // Your code here
        Scanner sc=new Scanner(System.in);
        String str=sc.next();

        for(int i=0;i<str.length();i++){
            // System.out.println(toUpperCase(str.charAt(i)));
            char x=str.charAt(i);
            if(x==Character.toUpperCase(x)){
                System.out.print(Character.toLowerCase(x));

            }else if(x==Character.toLowerCase(x)){
                System.out.print(Character.toUpperCase(x));
            }


        }
    }
}
