package Question_Of_The_Day;
import java.util.*;
public class Chess_Game {
    public static void main (String[] args) {
        // Your code here
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        scanner.close();

        int alexaPoints = a * 2 + b;
        int bobPoints = c * 2 + d;

        if (alexaPoints > bobPoints) {
            System.out.println("Alexa");
        } else if (alexaPoints < bobPoints) {
            System.out.println("Bob");
        } else {
            System.out.println("Tie");
        }
    }
}
