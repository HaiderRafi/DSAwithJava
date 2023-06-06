package Question_Of_The_Day;
import java.util.*;
public class Zoo {
    public static void main (String[] args) {
        // Your code here
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        int zCount = 0;
        int oCount = 0;

        for (char ch : word.toCharArray()) {
            if (ch == 'z') {
                zCount++;
            } else if (ch == 'o') {
                oCount++;
            }
        }

        if (zCount * 2 == oCount) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
