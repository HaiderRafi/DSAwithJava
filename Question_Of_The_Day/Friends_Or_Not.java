package Question_Of_The_Day;
import java.util.*;
public class Friends_Or_Not {
    public static void main (String[] args) {
        // Your code here

        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();

        int[]arr=new int[n+1];

        for(int i=1;i<n;i++){
            int x=sc.nextInt();
            int y=sc.nextInt();

            arr[x]++;
            arr[y]++;

            if(arr[x]==n-1||arr[y]==n-1){
                System.out.println("Yes");
                return;
            }

        }
        System.out.println("No");
    }
}
