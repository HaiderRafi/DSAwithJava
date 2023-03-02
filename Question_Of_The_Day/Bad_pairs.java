package Question_Of_The_Day;
import java.util.*;
public class Bad_pairs {
    public static void main (String[] args) {
        // Your code here
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        long count=0;
        long ans=0;

        for(int i=0;i<n;i++){
            if(arr[i]==(i+1)){
                count++;
            }
        }
        ans+=count*(count-1)/2;
        for(int i=0;i<n;i++){
            if(arr[i]>(i+1)&&arr[arr[i]-1]==(i+1)){
                ans++;
            }
        }
        System.out.println(ans);
    }
}
