package Question_Of_The_Day;
import java.util.*;
public class Subham_and_Arrays {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = sc.nextInt();
        int current;
        int evenCount = 0;
        int oddCount = 0;
        for(int i=0;i<n;i++)
        {
            current = sc.nextInt();
            if(current % 2 == 0)
                evenCount++;
            else
                oddCount++;
        }
        int ele = Math.min(evenCount,x-1);
        int ele2 = x - ele;
        if(ele2 % 2 == 0){
            ele2++;
        }
        if(oddCount >= ele2 && ele2 <= x)
            System.out.println("Yes");
        else
            System.out.println("No");


    }
}
