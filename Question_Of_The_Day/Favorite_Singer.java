package Question_Of_The_Day;
import java.util.*;
public class Favorite_Singer {
    public static void main (String[] args) {
        // Your code here
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        long[] songs = new long[N];

        for (int i = 0; i < N; i++) {
            songs[i] = scanner.nextLong();
        }

        Map<Long, Integer> singerCount = new HashMap<>();
        int maxCount = 0;

        for (int i = 0; i < N; i++) {
            long singer = songs[i];
            int count = singerCount.getOrDefault(singer, 0) + 1;
            singerCount.put(singer, count);
            maxCount = Math.max(maxCount, count);
        }

        int favoriteSingers = 0;

        for (int count : singerCount.values()) {
            if (count == maxCount) {
                favoriteSingers++;
            }
        }

        System.out.println(favoriteSingers);
    }
}
