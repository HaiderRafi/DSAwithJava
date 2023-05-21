package Question_Of_The_Day;
import java.util.*;
public class Stone_Piles {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        boolean isOne = true;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 1) {
                isOne = false;
            }
        }

        if (isOne) {
            if (n % 2 == 0) {
                System.out.println("Second");
            } else {
                System.out.println("First");
            }
        } else {
            int[] brr = new int[n];
            brr[0] = 1;
            for (int i = 1; i < n; i++) {
                boolean flag = false;
                if (arr[i] > 1 && arr[i - 1] > 1) {
                    brr[i] = brr[i - 1];
                } else if (arr[i] > 1 && arr[i - 1] == 1) {
                    if (brr[i - 1] == 1) {
                        brr[i] = 0;
                    } else {
                        brr[i] = 1;
                    }
                } else if (arr[i] == 1) {
                    if (brr[i - 1] == 1) {
                        brr[i] = 0;
                    } else {
                        brr[i] = 1;
                    }
                }
            }

            for (int i = 0; i < n; i++) {
                if (arr[i] > 1) {
                    if (brr[i] == 0) {
                        System.out.println("Second");
                    } else {
                        System.out.println("First");
                    }
                    break;
                }
            }
        }
    }
}
