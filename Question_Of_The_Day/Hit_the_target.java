package Question_Of_The_Day;
import java.util.*;
public class Hit_the_target {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            long[] a = new long[10000];
            int n = scanner.nextInt();
            for (int i = 0; i < n; i++)
                a[i] = scanner.nextLong();

            long ans = a[0];
            for (int i = 1; i < n; i++)
                ans = ((a[i] * ans) / (gcd(a[i], ans)));

            System.out.println(ans);
        }
    }

    public static long gcd(long a, long b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }
}
