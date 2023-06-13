package Question_Of_The_Day;
import java.util.*;
public class Next_consonant {
    public static void main (String[] args) {
        // Your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String str = scanner.next();

        String result = replaceVowels(str);

        System.out.println(result);
    }

    public static String replaceVowels(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (isVowel(ch)) {
                sb.append(getNextConsonant(ch));
            } else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    public static char getNextConsonant(char ch) {
        ch = Character.toLowerCase(ch);
        if (ch == 'z') {
            return 'b';
        } else if (ch >= 'a' && ch <= 'y') {
            return (char) (ch + 1);
        }
        return ch;
    }
}
