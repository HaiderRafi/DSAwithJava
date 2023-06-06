package Question_Of_The_Day;
import java.util.*;
public class Jumping_Stairs {
    public static final int MOD = 1000000007;

    public static int temp(int a, int b) {

        Vector<Integer> dp = new Vector<>(a + 1);

        for (int i = 0; i <= a; ++i) {
            dp.add(0);
        }
        dp.set(1, 1);

        for (int i = 1; i <= a; ++i) {
            for (int j = 1; j <= b && i + j <= a; ++j) {
                dp.set(i + j, (dp.get(i + j) + dp.get(i)) % MOD);
            }
        }

        return dp.get(a);
    }
    public static void main (String[] args) {
        // Your code here

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int ways = temp(a, b);
        System.out.println(ways);
    }
}
