package Question_Of_The_Day;
import java.util.*;
public class Gift_Hunter {
    public static void main (String[] args) {
        // Your code here
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int l = scanner.nextInt();
        String path = scanner.next();

        int x = 0, y = 0;
        for (char direction : path.toCharArray()) {
            if (direction == 'L') {
                x--;
            } else if (direction == 'R') {
                x++;
            } else if (direction == 'D') {
                y--;
            } else if (direction == 'U') {
                y++;
            }

            if (x == k && y == l) {
                System.out.println("YES");
                return;
            }
        }

        System.out.println("NO");
    }
}
