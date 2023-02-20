package Question_Of_The_Day;

import java.util.Scanner;

public class Minimise_Time_Travel {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int p=sc.nextInt();
        int q=sc.nextInt();
        int r=sc.nextInt();

        int a=p+q;
        int b=p+r;
        int c=q+r;


        if(p+q==q+r){
            System.out.println(p+q);
        }else{
            System.out.println(Math.min(c,(Math.min(a,b))));
        }
    }
}
