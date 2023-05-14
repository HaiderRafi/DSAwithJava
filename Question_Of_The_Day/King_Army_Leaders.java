package Question_Of_The_Day;
import java.util.*;
public class King_Army_Leaders {
    public static void main(String[] args) {
        // Your code here
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt(); // size of the first army
        int n2 = scanner.nextInt(); // size of the second army

        int[] army1 = new int[n1];
        int[] army2 = new int[n2];

        // Read the members of the first army
        for (int i = 0; i < n1; i++) {
            army1[i] = scanner.nextInt();
        }

        // Read the members of the second army
        for (int i = 0; i < n2; i++) {
            army2[i] = scanner.nextInt();
        }

        int leaders1 = countLeaders(army1);
        int leaders2 = countLeaders(army2);

        if (leaders1 > leaders2) {
            System.out.println(1); // First army wins
        } else {
            System.out.println(2); // Second army wins
        }
    }

    // Function to count the number of leaders in an army
    private static int countLeaders(int[] army) {
        int leaders = 0;
        int maxSoldier = Integer.MIN_VALUE;

        for (int i = army.length - 1; i >= 0; i--) {
            if (army[i] >= maxSoldier) {
                leaders++;
                maxSoldier = army[i];
            }
        }

        return leaders;
    }
}
