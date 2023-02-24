package Assignments;
import java.util.*;
public class Sort_by_Absolute_Difference {
    static void rearrange(int[] arr, int n, int x) {
        TreeMap<Integer, ArrayList<Integer>> m = new TreeMap<>();

        // Store values in a map with the difference
        // with X as key
        for (int i = 0; i < n; i++) {
            int diff = Math.abs(x - arr[i]);
            if (m.containsKey(diff)) {
                ArrayList<Integer> al = m.get(diff);
                al.add(arr[i]);
                m.put(diff, al);
            } else {
                ArrayList<Integer> al = new ArrayList<>();
                al.add(arr[i]);
                m.put(diff, al);
            }
        }

        // Update the values of array
        int index = 0;
        for (Map.Entry entry : m.entrySet()) {
            ArrayList<Integer> al = m.get(entry.getKey());
            for (int i = 0; i < al.size(); i++)
                arr[index++] = al.get(i);
        }
    }

    // Function to print the array
    static void printArray(int[] arr, int n) {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");

        System.out.println();
    }
    public static void main (String[] args) {
        // Your code here
        try (Scanner sc = new Scanner(System.in)) {
            int num = sc.nextInt();
            while (num-- > 0) {
                int a = sc.nextInt();
                int x = sc.nextInt();

                int[] arr = new int[a];
                for (int i = 0; i < a; i++) {
                    arr[i] = sc.nextInt();
                }

                int n = arr.length;
                rearrange(arr, n, x);
                printArray(arr, n);

            }
        }

    }
}
