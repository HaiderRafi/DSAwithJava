package Question_Of_The_Day;
import java.util.*;
public class Distinct_Lottery {
    public static void main (String[] args) {
        // Your code here
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();

        String []arr= new String[n];

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.next();
            // System.out.println(arr[i]);

        }

        int count = 0;
        HashMap<String, Integer> map = new HashMap<>();
        for (String s : arr) {
            map.put(s, 1);
        }
        System.out.println(map.size());

        // for(int j=1;j<arr.length;j++){
        //         System.out.println(arr[j]);
        //     }



        // int count=0;
        // for(int i=0;i<n;i++){
        //     String s=sc.next();
        //     // System.out.println(s.charAt(i));
        //     if(s.charAt(i)==(s.charAt(i))){
        //         count++;
        //     }
        // }
        //  System.out.println(count);

    }
}
