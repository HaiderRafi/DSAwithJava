package Question_Of_The_Day;
import java.util.*;
public class Smallest_duplicate_number {
    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int smallestDuplicate = findSmallestDuplicate(arr);

        System.out.println(smallestDuplicate);
    }

    public static int findSmallestDuplicate(int[] arr) {
        int smallestDuplicate = -1;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j] && (smallestDuplicate == -1 || arr[i] < smallestDuplicate)) {
                    smallestDuplicate = arr[i];
                    break; // Exit inner loop once smallest duplicate is found
                }
            }
        }

        return smallestDuplicate;
    }
}
