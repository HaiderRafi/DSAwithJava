package Question_Of_The_Day;
import java.util.*;
public class Odd_Island {
    static void findDistinctOddSum(int n, int k)
    {
        // Condition to check if there
        // are enough values to check
        if ((k * k) <= n &&
                (n + k) % 2 == 0){
            int val = 1;
            int sum = 0;
            for(int i = 1; i < k; i++){

                sum += val;
                val += 2;
            }
            System.out.print("YES \n");
        }
        else
            System.out.print("NO \n");
    }

    // Driver Code
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        findDistinctOddSum(n, k);
    }
}
