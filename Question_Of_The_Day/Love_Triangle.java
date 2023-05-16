package Question_Of_The_Day;
import java.util.*;
public class Love_Triangle {
    public static void main (String[] args) {
        // Your code here
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] likes = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            likes[i] = scanner.nextInt();
        }

        boolean hasLoveTriangle = false;

        for (int i = 1; i <= n; i++) {
            int j = likes[i];
            int k = likes[j];

            if (likes[k] == i) {
                hasLoveTriangle = true;
                break;
            }
        }

        if (hasLoveTriangle) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        scanner.close();
    }
}
