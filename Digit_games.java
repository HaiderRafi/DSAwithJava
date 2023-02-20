import java.util.Scanner;

public class Digit_games {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String n =sc.next();


        int a=n.charAt(0)-'0';
        int b=n.charAt(1)-'0';
        int c=n.charAt(2)-'0';

        // System.out.println(a);
        // System.out.println(b);
        // System.out.println(c);

        int ans = 0;
        ans += a*100 + b*10 + c;
        ans += b*100 + c*10 + a;
        ans += c*100 + a*10 + b;

        System.out.println(ans);

    }
}
