package Assignments;
import java.util.*;
import java.io.*;
public class Wave_array {
    void swap(int arr[], int a, int b)
    {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    // arr[0] >= arr[1] <= arr[2] >= arr[3] <= arr[4]..
    void sortInWave(int arr[], int n)
    {
        // Sort the input array
        Arrays.sort(arr);
        // Swap adjacent elements
        for (int i=0; i<n-1; i += 2)
            swap(arr, i, i+1);
    }
    // Driver method
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
//        Main ob = new Main();
//        ob.sortInWave(arr, n);
//        for (int i : arr)
//            System.out.print(i + " ");
    }
}
