package Question_Of_The_Day;

import java.util.Scanner;

public class Potential_Stones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int X = sc.nextInt();
        for (int i = X - K + 1; i < X + K; i++){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
