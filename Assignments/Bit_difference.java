package Assignments;
import java.util.*;
public class Bit_difference {
    public static void main (String[] args) {
        // Your code here
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            long ans = 0;
            long arr[] = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextLong();

            }
            for (int i = 0; i < 32; i++) {
                long count = 0;
                for (int j = 0; j < n; j++)

                    if ((arr[j] & (1 << i)) != 0)
                        count++;

                ans += (count * (n - count) * 2);

            }
            System.out.print(ans % 1000000007);
        }
    }
}
