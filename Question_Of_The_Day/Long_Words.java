package Question_Of_The_Day;
import java.util.*;
public class Long_Words {
    public static void main (String[] args) {
        // Your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=0;i<n;i++){
            String str=sc.next();
            if(str.length()<=10){
                System.out.println(str);
            }else{
                char first=str.charAt(0);
                char last=str.charAt(str.length()-1);
                int length=(str.length())-2;
                System.out.println(first+""+length+""+last);

            }
        }
    }
}
