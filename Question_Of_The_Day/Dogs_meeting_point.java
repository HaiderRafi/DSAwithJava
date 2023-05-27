package Question_Of_The_Day;
import java.util.*;
public class Dogs_meeting_point {
    public static void main (String[] args) {
        // Your code here
        Scanner scanner = new Scanner(System.in);
        int p = scanner.nextInt();
        int q = scanner.nextInt();
        int r = scanner.nextInt();
        int s = scanner.nextInt();

        int time = calculateMeetingTime(p, q, r, s);
        System.out.println(time);
    }

    private static int calculateMeetingTime(int p, int q, int r, int s) {
        int distance = q - p;
        int relativeSpeed = r + s;

        if (distance % relativeSpeed != 0)
            return -1;

        return distance / relativeSpeed;
    }
}
