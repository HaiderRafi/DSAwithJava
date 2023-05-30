package Question_Of_The_Day;
import java.util.*;
public class Unique_Numbers_Game {
    public static void main (String[] args) {
        // Your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] alexaArray = new int[n];
        int[] bobArray = new int[n];

        for (int i = 0; i < n; i++) {
            alexaArray[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            bobArray[i] = scanner.nextInt();
        }

        String winner = findWinner(alexaArray, bobArray);
        System.out.println(winner);
    }

    private static String findWinner(int[] alexaArray, int[] bobArray) {
        Set<Integer> alexaSet = new HashSet<>();
        Set<Integer> bobSet = new HashSet<>();

        // Add elements from Alexa's array to the set
        for (int num : alexaArray) {
            alexaSet.add(num);
        }

        // Add elements from Bob's array to the set
        for (int num : bobArray) {
            bobSet.add(num);
        }

        // Compare the sizes of the sets to determine the winner
        if (alexaSet.size() > bobSet.size()) {
            return "Alexa";
        } else {
            return "Bob";
        }
    }
}
